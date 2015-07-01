/**
 * 
 */
package com.aeronomos.simulation.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.simulation.SimulationService;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class SimulationServiceImpl implements SimulationService {

	private static final Logger LOG = LoggerFactory
			.getLogger(SimulationServiceImpl.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.simulation.SimulationService#start()
	 */
	@Override
	public void start() {

		LOG.info("Starting simulation service...");

		LOG.info("Simulation service started.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.simulation.SimulationService#stop()
	 */
	@Override
	public void stop() {

		LOG.info("Stopping simulation service...");

		LOG.info("Simulation service stopped.");
	}

}
