/**
 * 
 */
package com.aeronomos.configuration.internal;

import java.util.Dictionary;

import org.aeronomos.model.configuration.MessagingConfigurationDocument;
import org.aeronomos.model.configuration.MessagingConfigurationDocument.MessagingConfiguration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ISet;

/**
 * Provides the messaging configuration via a {@link ManagedService}.
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 265 $
 * 
 */
public class MessagingConfigurationService implements ManagedService {

	private static final Logger LOG = LoggerFactory
			.getLogger(MessagingConfigurationService.class.getName());

	private MessagingConfigurationDocument messagingConfigurationDocument = null;
	private ISet<MessagingConfigurationDocument> messagingConfigurationSet = null;

	private final static String messagingConfigurationSetName = "com.aeronomos.messaging.configuration";

	/**
	 * 
	 * @throws AeroNomosException
	 */
	public MessagingConfigurationService() throws AeroNomosException {

		messagingConfigurationSet = Hazelcast.getSet(messagingConfigurationSetName);

		if (messagingConfigurationSet == null) {
			throw new AeroNomosException(
					"Unable to create messaging configuration set");
		}

		messagingConfigurationDocument = MessagingConfigurationDocument.Factory
				.newInstance();
		MessagingConfiguration messagingConfiguration = messagingConfigurationDocument
				.addNewMessagingConfiguration();
		messagingConfiguration.setMessagingHost("localhost");
		messagingConfiguration.setMessagingPort(61616);
		messagingConfiguration.setMessagingTransport("tcp");

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

			LOG.debug("Previous or default messaging configuration values : ");
			LOG.debug("Host\t\t= ["
					+ messagingConfigurationDocument.getMessagingConfiguration()
							.getMessagingHost() + "]");
			LOG.debug("Port\t\t= ["
					+ messagingConfigurationDocument.getMessagingConfiguration()
							.getMessagingPort() + "]");
			LOG.debug("Transport\t= ["
					+ messagingConfigurationDocument.getMessagingConfiguration()
							.getMessagingTransport() + "]");

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

	/**
	 * @return the messagingconfigurationtopicname
	 */
	public static String getMessagingconfigurationtopicname() {
		return messagingConfigurationSetName;
	}

}
