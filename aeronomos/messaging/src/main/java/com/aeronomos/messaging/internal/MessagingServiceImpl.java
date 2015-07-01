/**
 * 
 */
package com.aeronomos.messaging.internal;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.aeronomos.model.configuration.MessagingConfigurationDocument;
import org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.osgi.context.BundleContextAware;

import com.aeronomos.commons.AbstractServiceImpl;
import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.configuration.ConfigurationService;
import com.aeronomos.messaging.MessagingService;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ISet;

/**
 * 
 * Last modified by : $Author: $
 * 
 * $Id: MessagingServiceImpl.java 265 2012-08-06 01:18:12Z  $
 * 
 */
public class MessagingServiceImpl extends AbstractServiceImpl implements
		MessagingService, ManagedService, BundleContextAware {

	private static final Logger LOG = LoggerFactory
			.getLogger(MessagingServiceImpl.class.getName());

	private ActiveMQConnectionFactory connectionFactory;
	private Connection connection = null;
	private BundleContext bundleContext;

	private ServiceRegistration managedServiceRegistration;

	private MessagingConfigurationDocument messagingConfigurationDocument = null;
	private ISet<MessagingConfigurationDocument> messagingConfigurationSet = null;
	private Session session = null;

	private Destination requestQueue = null;
	private MessageConsumer eventQueueConsumer;

	private ConfigurationService configurationService;

	private final static String messagingConfigurationSetName = "com.aeronomos.messaging.configuration";
	private final static String messagingConfigurationServicePID = "com.aeronomos.messaging";
	private final static String servicePIDKey = "service.pid";

	/**
	 * 
	 */
	public MessagingServiceImpl() throws AeroNomosException {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.messaging.MessagingService#start()
	 */
	@Override
	public void start() throws AeroNomosException {

		LOG.debug("Starting messaging service...");

		messagingConfigurationDocument = MessagingConfigurationDocument.Factory
				.newInstance();

		if (messagingConfigurationDocument == null) {
			throw new AeroNomosException("Error starting messaging service. "
					+ "Unable to create MessagingConfigurationDocument");
		}
		MessagingConfiguration messagingConfiguration = messagingConfigurationDocument
				.addNewMessagingConfiguration();
		if (messagingConfiguration == null) {
			throw new AeroNomosException(
					"Error starting messaging service. "
							+ "Unable to create MessagingConfiguration from MessagingConfigurationDocument");
		}
		messagingConfiguration.setMessagingHost("localhost");
		messagingConfiguration.setMessagingPort(61616);
		messagingConfiguration.setMessagingTransport("tcp");

		LOG.debug("Default messaging configuration ["
				+ messagingConfigurationDocument + "].");

		messagingConfigurationSet = Hazelcast.getSet(messagingConfigurationSetName);

		if (messagingConfigurationSet == null) {
			LOG.warn("Unable to create messaging configuration set for dcache.");
		}

		// register service for heartbeat configuration

		if (bundleContext != null) {

			LOG.debug("Registering MessagingServce as a managed service...");

			Dictionary<String, String> props = new Hashtable<String, String>();

			props.put(servicePIDKey, messagingConfigurationServicePID);

			managedServiceRegistration = bundleContext.registerService(
					ManagedService.class.getName(), this, props);

			addDestinationNameEntry("messaging.configuration",
					"com.aeronomos.messaging.configuration");

			LOG.info("MessagingServce registered as a managed service.");

		} else {
			LOG.warn("Bundle context is null. Unable to register MessagingServce as a managed service");
		}

		LOG.info("Messaging service started.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.messaging.MessagingService#stop()
	 */
	@Override
	public void stop() throws AeroNomosException {

		LOG.info("Stopping messaging service...");

		if (managedServiceRegistration != null) {

			managedServiceRegistration.unregister();
			managedServiceRegistration = null;
		}

		disconnectFromBroker();

		LOG.info("Messaging service stopped.");

	}

	/**
	 * @throws AeroNomosException
	 * 
	 */
	private void connectToBroker(final String host, final Integer port,
			final String transport) throws AeroNomosException {

		String connectionUrl = new String();

		if (host == null) {
			throw new AeroNomosException(
					"Host value was null in messaging configuration file");
		}

		if (transport == null) {
			throw new AeroNomosException(
					"Transport value was null in messaging configuration file");
		}

		if (port == null) {
			throw new AeroNomosException(
					"Port value was null in messaging configuration file");
		}

		connectionUrl = transport + "://" + host + ":" + port;

		// make connect to the message broker
		//
		connectionFactory = new ActiveMQConnectionFactory(connectionUrl);

		try {

			connection = connectionFactory.createConnection();
			if (connection == null) {
				throw new AeroNomosException("Unable to connect to broker @ ["
						+ connectionUrl + "]");
			}

			connection.start();

			// create session
			//
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		} catch (JMSException e) {
			throw new AeroNomosException(e);
		}

		LOG.debug("Established connection to message broker at [" + connectionUrl
				+ "]");

	}

	/**
	 * 
	 * @throws AeroNomosException
	 */
	private void disconnectFromBroker() throws AeroNomosException {

		// clean up the JMS resources
		//
		try {

			if (session != null) {
				session.close();
			}

			if (connection != null) {
				connection.close();
			}

			connectionFactory = null;

		} catch (JMSException e) {
			throw new AeroNomosException(e);
		}

	}

	@Override
	public void startConsumer() throws JMSException {

		LOG.debug("Starting consumer...");

		requestQueue = session.createQueue("com.aeronomos.messaging.request.queue");

		// create a consumer of the Request queue

		eventQueueConsumer = session.createConsumer(requestQueue);

		eventQueueConsumer.setMessageListener(new RequestMessageListener());

		LOG.info("Consumer started.");
	}

	@Override
	public void stopConsumer() throws JMSException {

		LOG.debug("Stopping consumer...");

		if (eventQueueConsumer != null) {
			eventQueueConsumer.close();
		}

		LOG.info("Consumer stopped.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.osgi.service.cm.ManagedService#updated(java.util.Dictionary)
	 */
	@Override
	public void updated(@SuppressWarnings("rawtypes") Dictionary properties)
			throws ConfigurationException {

		if (properties == null) {

			LOG.debug("No configuration from configuration admin or "
					+ "old configuration has been deleted");

		} else {

			LOG.debug("Previous or default messaging configuration values : ["
					+ messagingConfigurationDocument + "]");

			Integer messagingPort = 61616;
			String messagingTransport = "tcp";
			String messagingHost = "localhost";

			LOG.debug("Messaging configuration updated - [" + properties + "] from ["
					+ properties.get("felix.fileinstall.filename") + "]");

			String value = (String) properties.get("messagingPort");

			if (value != null) {
				try {
					messagingPort = Integer.valueOf(value);
				} catch (NumberFormatException nfe) {
					LOG.error("Error in messaging configuration parameters. messagingPort parameter ["
							+ value
							+ "] is not a valid integer. "
							+ nfe.getLocalizedMessage());
					return;
				}
			}

			messagingTransport = (String) properties.get("messagingTransport");
			messagingHost = (String) properties.get("messagingHost");

			LOG.debug("New messaging configuration values : ");
			LOG.debug("Host\t\t= [" + messagingHost + "]");
			LOG.debug("Port\t\t= [" + messagingPort + "]");
			LOG.debug("Transport\t= [" + messagingTransport + "]");

			try {
				disconnectFromBroker();
			} catch (AeroNomosException e1) {
				LOG.warn("Error disconnecting from broker. ["
						+ e1.getLocalizedMessage() + "]");
			}

			try {
				connectToBroker(messagingHost, messagingPort, messagingTransport);
			} catch (AeroNomosException e) {
				LOG.error("Error connecting to messaging host ["
						+ e.getLocalizedMessage() + "]");
				return;
			}

			if (messagingConfigurationSet != null) {

				if (messagingConfigurationDocument.getMessagingConfiguration() != null) {

					messagingConfigurationDocument.getMessagingConfiguration()
							.setMessagingHost(messagingHost);
					messagingConfigurationDocument.getMessagingConfiguration()
							.setMessagingPort(messagingPort);
					messagingConfigurationDocument.getMessagingConfiguration()
							.setMessagingTransport(messagingTransport);

					LOG.debug("Adding messaging configuration ["
							+ messagingConfigurationDocument + "]...");

					messagingConfigurationSet.add(messagingConfigurationDocument);

					LOG.info("Messaging configuration [" + messagingConfigurationDocument
							+ "] added.");
				} else {

					LOG.warn("Unable to update the messaging configuration. "
							+ "MessagingConfigurationDocument was null.");
				}

			} else {
				LOG.warn("Unable to update the messaging configuration. MessagingConfigurationSet was null.");
			}

		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.osgi.context.BundleContextAware#setBundleContext(org
	 * .osgi.framework.BundleContext)
	 */
	@Override
	public void setBundleContext(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.messaging.MessagingService#getConfigurationService()
	 */
	@Override
	public ConfigurationService getConfigurationService() {
		return configurationService;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.messaging.MessagingService#setConfigurationService(
	 * ConfigurationService)
	 */
	@Override
	public void setConfigurationService(ConfigurationService configurationService) {
		this.configurationService = configurationService;
	}

}
