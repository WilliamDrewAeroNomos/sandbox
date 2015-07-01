/**
 *  
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 */
package com.aeronomos.persistence.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.persistence.EventDao;
import com.aeronomos.persistence.PersistenceService;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class PersistenceServiceImpl implements PersistenceService {

	private static final Logger LOG = LoggerFactory
			.getLogger(PersistenceServiceImpl.class.getName());

	// private EventDao eventDao;

	public void setProductDao(EventDao eventDao) {
		// this.eventDao = eventDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.persistence.PersistenceService#start()
	 */
	public void start() {

		LOG.debug("Starting persistence service...");

		LOG.info("Started persistence service.");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.persistence.PersistenceService#stop()
	 */
	public void stop() {
		LOG.debug("Stopping persistence service...");

		LOG.info("Stopped persistence service.");

	}

}
