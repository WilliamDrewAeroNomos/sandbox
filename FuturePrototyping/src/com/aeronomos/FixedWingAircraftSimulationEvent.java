/**
 * 
 */
package com.aeronomos;

/**
 * @author williamdrew
 * 
 */
public class FixedWingAircraftSimulationEvent extends AbstractSimulationEvent {

	/**
	 * 
	 */
	public FixedWingAircraftSimulationEvent(final long relativeTimeOffset) {
		super(relativeTimeOffset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationEvent#convertToSimulationObject()
	 */
	@Override
	public SimulationObject convertToSimulationObject() {
		return new FixedWingAircraftSimulationObject();
	}

}
