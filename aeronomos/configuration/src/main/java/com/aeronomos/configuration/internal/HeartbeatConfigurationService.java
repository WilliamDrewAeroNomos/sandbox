/**
 * 
 */
package com.aeronomos.configuration.internal;

import java.util.Dictionary;

import org.aeronomos.model.configuration.HeartbeatConfigurationDocument;
import org.aeronomos.model.configuration.HeartbeatConfigurationDocument.HeartbeatConfiguration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ITopic;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * 
 *         $Id: HeartbeatConfigurationService.java 265 2012-08-06 01:18:12Z  $
 * 
 */
public class HeartbeatConfigurationService implements ManagedService {

	private static final Logger LOG = LoggerFactory
			.getLogger(HeartbeatConfigurationService.class.getName());

	private HeartbeatConfigurationDocument heartbeatConfigurationDocument = null;
	private ITopic<HeartbeatConfigurationDocument> heartbeatConfigurationTopic = null;

	// TODO: Move to commons service
	private final static String heartbeatConfigurationTopicName = "com.aeronomos.heartbeat.configuration";

	/**
	 * @throws AeroNomosException
	 */
	public HeartbeatConfigurationService() throws AeroNomosException {

		heartbeatConfigurationTopic = Hazelcast
				.getTopic(heartbeatConfigurationTopicName);

		if (heartbeatConfigurationTopic == null) {
			throw new AeroNomosException(
					"Unable to create heartbeat configuration topic");
		}

		heartbeatConfigurationDocument = HeartbeatConfigurationDocument.Factory
				.newInstance();
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

			LOG.debug("Previous or default heartbeat configuration values : ");
			LOG.debug(heartbeatConfigurationDocument.toString());

			LOG.debug("Heartbeat configuration being updated with [" + properties
					+ "] from [" + properties.get("felix.fileinstall.filename") + "]");

			String stringPropValue = (String) properties.get("generateHeartbeat");

			Boolean generateHeartbeat = null;
			Integer intervalBetweenBeatsMSecs;

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
							.addNewHeartbeatConfiguration();

					heartbeatConfiguration.setGenerateHeartbeat(generateHeartbeat);
					heartbeatConfiguration
							.setIntervalBetweenBeatsMsecs(intervalBetweenBeatsMSecs);

					LOG.debug("Publishing new heartbeat configuration ["
							+ heartbeatConfiguration + "]...");

					heartbeatConfigurationTopic.publish(heartbeatConfigurationDocument);

					LOG.debug("Updated heartbeat configuration ["
							+ heartbeatConfigurationDocument.toString() + "] published.");

				} else {
					LOG.warn("Heartbeat configuration configuration topic was null");
				}

			} else {
				LOG.warn("Unable to update the messaging configuration in the dcache");
			}

		}

	}

	/**
	 * @return the heartbeatconfigurationtopicname
	 */
	public static String getHeartbeatconfigurationtopicname() {
		return heartbeatConfigurationTopicName;
	}
}
