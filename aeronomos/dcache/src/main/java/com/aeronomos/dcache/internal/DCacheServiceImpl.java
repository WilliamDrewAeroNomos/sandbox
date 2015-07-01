/**
 * 
 */
package com.aeronomos.dcache.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.dcache.DCacheService;

/**
 * 
 * @author <a href=mailto:Nexsim-support@csc.com>Nexsim</a>
 * @version $Revision: 220 $
 * 
 */

public class DCacheServiceImpl implements DCacheService {

	private static final Logger LOG = LoggerFactory
			.getLogger(DCacheServiceImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.dcache.DCacheService#start()
	 */
	public void start() {

		LOG.debug("Starting DCache service...");

		LOG.info("Started DCache service.");
	}

	/*
	 * /(non-Javadoc)
	 * 
	 * @see com.aeronomos.dcache.DCacheService#stop()
	 */
	public void stop() {

		LOG.debug("Stopping DCache service...");

		LOG.info("Stopped DCache service.");
	}

}
