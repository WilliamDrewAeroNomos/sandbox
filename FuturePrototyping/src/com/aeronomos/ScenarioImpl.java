/**
 * 
 */
package com.aeronomos;

import java.util.Date;

/**
 * @author williamdrew
 * 
 */
public class ScenarioImpl implements Scenario {

	private Date simulationStartTimstamp;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.Scenario#getSimulationStartTimestamp()
	 */
	@Override
	public Date getSimulationStartTimestamp() {
		return simulationStartTimstamp;
	}

}
