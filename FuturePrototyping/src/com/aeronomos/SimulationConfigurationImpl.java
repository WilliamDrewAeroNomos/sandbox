/**
 * 
 */
package com.aeronomos;

import java.util.Date;

/**
 * @author williamdrew
 * 
 */
public class SimulationConfigurationImpl implements SimulationConfiguration {

	private Date simulationStartTimestamp;
	private long simulationDuration;
	private SimulationTriggerEnum simulationTrigger;

	public SimulationConfigurationImpl() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#getSimulationStartTimestamp()
	 */
	@Override
	public Date getSimulationStartTimestamp() {
		return simulationStartTimestamp;
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#setSimulationStartTimestamp(java.util.Date)
	 */
	@Override
	public void setSimulationStartTimestamp(Date simulationStartTimestamp) {
		this.simulationStartTimestamp = simulationStartTimestamp;
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#getSimulationDuration()
	 */
	@Override
	public long getSimulationDuration() {
		return simulationDuration;
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#setSimulationDuration(long)
	 */
	@Override
	public void setSimulationDuration(long simulationDuration) {
		this.simulationDuration = simulationDuration;
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#getSimulationTrigger()
	 */
	@Override
	public SimulationTriggerEnum getSimulationTrigger() {
		return simulationTrigger;
	}

	/* (non-Javadoc)
	 * @see com.aeronomos.SimulationConfiguration#setSimulationTrigger(com.aeronomos.SimulationTriggerEnum)
	 */
	@Override
	public void setSimulationTrigger(SimulationTriggerEnum simulationTrigger) {
		this.simulationTrigger = simulationTrigger;
	}

}
