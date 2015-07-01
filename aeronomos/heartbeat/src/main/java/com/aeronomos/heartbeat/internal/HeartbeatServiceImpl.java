/**
 * 
 */
package com.aeronomos.heartbeat.internal;

import java.util.Dictionary;
import java.util.Hashtable;

import org.aeronomos.model.configuration.HeartbeatConfigurationDocument;
import org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.osgi.context.BundleContextAware;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.heartbeat.HeartbeatService;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ITopic;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * 
 *         $Id: HeartbeatServiceImpl.java 265 2012-08-06 01:18:12Z  $
 * 
 */
public class HeartbeatServiceImpl implements HeartbeatService, ManagedService,
		BundleContextAware {

	private static final Logger LOG = LoggerFactory
			.getLogger(HeartbeatServiceImpl.class.getName());

	private Boolean generateHeartbeat = true;
	private Integer intervalBetweenBeatsMSecs = 5000;

	private BundleContext bundleContext;
	private final static String heartbeatConfigurationServicePID = "com.aeronomos.heartbeat";
	private final static String servicePIDKey = "service.pid";

	private HeartbeatConfigurationDocument heartbeatConfigurationDocument = null;
	private ServiceRegistration managedServiceRegistration;
	private ITopic<HeartbeatConfigurationDocument> heartbeatConfigurationTopic = null;

	// TODO: Move to commons service
	private final static String heartbeatConfigurationTopicName = "com.aeronomos.heartbeat.configuration";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomo.heartbeat.HeartbeatService#start()
	 */
	@Override
	public void start() throws AeroNomosException {

		LOG.info("Starting heartbeat service...");

		heartbeatConfigurationDocument = HeartbeatConfigurationDocument.Factory
				.newInstance();

		if (heartbeatConfigurationDocument == null) {
			throw new AeroNomosException(
					"Unable to create a HeartbeatConfigurationDocument.");
		}

		HeartbeatConfiguration heartbeatConfiguration = heartbeatConfigurationDocument
				.addNewHeartbeatConfiguration();

		if (heartbeatConfiguration == null) {
			throw new AeroNomosException(
					"Unable to create a HeartbeatConfiguration from heartbeatConfigurationDocument.");
		}

		heartbeatConfiguration.setGenerateHeartbeat(generateHeartbeat);
		heartbeatConfiguration
				.setIntervalBetweenBeatsMsecs(intervalBetweenBeatsMSecs);

		heartbeatConfigurationTopic = Hazelcast
				.getTopic(heartbeatConfigurationTopicName);

		if (heartbeatConfigurationTopic == null) {
			throw new AeroNomosException(
					"Unable to create heartbeat configuration topic");
		}

		heartbeatConfigurationTopic.publish(heartbeatConfigurationDocument);

		// register service for heartbeat configuration

		Dictionary<String, String> props = new Hashtable<String, String>();

		props.put(servicePIDKey, heartbeatConfigurationServicePID);

		managedServiceRegistration = bundleContext.registerService(
				ManagedService.class.getName(), this, props);

		LOG.info("Heartbeat service started.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomo.heartbeat.HeartbeatService#stop()
	 */
	@Override
	public void stop() {

		LOG.info("Stopping heartbeat service...");

		if (managedServiceRegistration != null) {

			managedServiceRegistration.unregister();
			managedServiceRegistration = null;
		}

		LOG.info("Heartbeat service stopped.");
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

			LOG.debug("Previous or default heartbeat configuration values : ["
					+ heartbeatConfigurationDocument + "]");

			LOG.debug("Heartbeat configuration being updated with [" + properties
					+ "] from [" + properties.get("felix.fileinstall.filename") + "]");

			String stringPropValue = (String) properties.get("generateHeartbeat");

			if (stringPropValue != null) {
				generateHeartbeat = Boolean.valueOf(stringPropValue);
			}

			stringPropValue = (String) properties.get("intervalBetweenBeatsMSecs");

			intervalBetweenBeatsMSecs = Integer.valueOf(stringPropValue);

			LOG.debug("Heartbeat configuration values from configuration file update : ");
			LOG.debug("Generate heartbeat\t\t= [" + generateHeartbeat + "]");
			LOG.debug("Heartbeat interval\t\t= [" + intervalBetweenBeatsMSecs + "]");

			if (heartbeatConfigurationTopic != null) {

				if (heartbeatConfigurationDocument != null) {

					HeartbeatConfiguration heartbeatConfiguration = heartbeatConfigurationDocument
							.getHeartbeatConfiguration();

					heartbeatConfiguration.setGenerateHeartbeat(generateHeartbeat);
					heartbeatConfiguration
							.setIntervalBetweenBeatsMsecs(intervalBetweenBeatsMSecs);

					LOG.debug("Publishing new heartbeat configuration ["
							+ heartbeatConfigurationDocument + "]...");

					heartbeatConfigurationTopic.publish(heartbeatConfigurationDocument);

					LOG.debug("Updated heartbeat configuration ["
							+ heartbeatConfigurationDocument + "] published.");

				} else {
					LOG.warn("Heartbeat configuration configuration topic was null");
				}

			} else {
				LOG.warn("Unable to update the messaging configuration in the dcache");
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

}
