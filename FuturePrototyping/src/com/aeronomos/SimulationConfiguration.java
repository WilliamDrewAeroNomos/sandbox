/**
 * 
 */
package com.aeronomos;

import java.util.Date;

/**
 * @author williamdrew
 * 
 */
public interface SimulationConfiguration {

	/**
	 * @return the simulationStartTimestamp
	 */
	Date getSimulationStartTimestamp();

	/**
	 * @param simulationStartTimestamp
	 *            the simulationStartTimestamp to set
	 */
	void setSimulationStartTimestamp(Date simulationStartTimestamp);

	/**
	 * @return the simulationDuration
	 */
	long getSimulationDuration();

	/**
	 * @param simulationDuration
	 *            the simulationDuration to set
	 */
	void setSimulationDuration(long simulationDuration);

	/**
	 * @return the simulationTrigger
	 */
	SimulationTriggerEnum getSimulationTrigger();

	/**
	 * @param simulationTrigger
	 *            the simulationTrigger to set
	 */
	void setSimulationTrigger(SimulationTriggerEnum simulationTrigger);

}