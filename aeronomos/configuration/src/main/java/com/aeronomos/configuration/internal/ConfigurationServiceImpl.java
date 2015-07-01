/**
 * 
 */
package com.aeronomos.configuration.internal;

import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.osgi.context.BundleContextAware;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.configuration.ConfigurationService;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */

public class ConfigurationServiceImpl implements ConfigurationService,
		BundleContextAware {

	private static final Logger LOG = LoggerFactory
			.getLogger(ConfigurationServiceImpl.class.getName());

	// private final static String servicePIDKey = "service.pid";
	//
	// private final static String destinationNameServicePID =
	// "com.aeronomos.destination.names";
	//
	// private final static String messagingConfigurationServicePID =
	// "com.aeronomos.messaging";
	//
	// private final static String heartbeatConfigurationServicePID =
	// "com.aeronomos.heartbeat";
	//
	// private ServiceRegistration<?> messagingServiceServiceRegistration;
	//
	// private DestinationNameService destinationNameService;
	//
	// private MessagingConfigurationService messagingConfigurationService;
	//
	// private HeartbeatConfigurationService heartbeatConfigurationService;

	// destination names - default values

	private String heartbeatConfigurationTopicName = "com.aeronomos.heartbeat.configuration";

	private BundleContext bundleContext;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.configuration.ConfigurationService#
	 * getHeartbeatconfigurationtopicname()
	 */
	@Override
	public String getHeartbeatconfigurationtopicname() {
		return heartbeatConfigurationTopicName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.configuration.ConfigurationService#start()
	 */
	public void start() throws AeroNomosException {

		LOG.debug("Starting configuration service...");

		if (bundleContext != null) {

			// register managed service for destination names

			// Dictionary<String, String> props = new Hashtable<String, String>();

			// props.put(servicePIDKey, destinationNameServicePID);
			//
			// destinationNameService = new DestinationNameService();
			//
			// messagingServiceServiceRegistration = bundleContext.registerService(
			// ManagedService.class.getName(), destinationNameService, props);

			// register managed service for heartbeat configuration

			// props = new Hashtable<String, String>();
			//
			// props.put(servicePIDKey, heartbeatConfigurationServicePID);
			//
			// heartbeatConfigurationService = new HeartbeatConfigurationService();
			//
			// messagingServiceServiceRegistration = bundleContext.registerService(
			// ManagedService.class.getName(), heartbeatConfigurationService, props);
			//
			// // register managed service for messaging configuration
			//
			// props = new Hashtable<String, String>();
			//
			// props.put(servicePIDKey, messagingConfigurationServicePID);
			//
			// messagingConfigurationService = new MessagingConfigurationService();
			//
			// messagingServiceServiceRegistration = bundleContext.registerService(
			// ManagedService.class.getName(), messagingConfigurationService, props);

		} else {
			LOG.warn("Bundle context was null.");
		}

		LOG.info("Started configuration service.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.configuration.ConfigurationService#stop()
	 */
	public void stop() {

		LOG.debug("Stopping configuration service...");

		// if (messagingServiceServiceRegistration != null) {
		// messagingServiceServiceRegistration.unregister();
		// messagingServiceServiceRegistration = null;
		// }

		LOG.debug("Stopped configuration service...");
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

}
