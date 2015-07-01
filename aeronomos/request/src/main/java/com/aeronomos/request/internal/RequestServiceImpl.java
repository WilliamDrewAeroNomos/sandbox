/**
 * 
 */
package com.aeronomos.request.internal;

import org.aeronomos.model.configuration.MessagingConfigurationDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.request.RequestService;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.ISet;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 269 $
 * 
 */
public class RequestServiceImpl implements RequestService {

	private static final Logger LOG = LoggerFactory
			.getLogger(RequestServiceImpl.class.getName());

	private ISet<MessagingConfigurationDocument> messagingConfigurationSet = null;

	private UserRequestServer userRequestServer;

	private final static String messagingConfigurationSetName = "com.aeronomos.messaging.configuration";

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomo.heartbeat.HeartbeatService#start()
	 */
	@Override
	public void start() throws AeroNomosException {

		LOG.info("Starting request service...");

		messagingConfigurationSet = Hazelcast.getSet(messagingConfigurationSetName);

		if (messagingConfigurationSet == null) {
			LOG.warn("Unable to create messaging configuration set for dcache.");
		}

		userRequestServer = new UserRequestServer();

		userRequestServer.start();

		LOG.info("Request service started.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomo.heartbeat.HeartbeatService#stop()
	 */
	@Override
	public void stop() {

		LOG.info("Stopping request service...");

		if (userRequestServer != null) {
			userRequestServer.stop();
		}

		LOG.info("Request service stopped.");
	}
}
