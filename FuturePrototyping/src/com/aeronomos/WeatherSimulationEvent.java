/**
 * 
 */
package com.aeronomos;

/**
 * @author williamdrew
 * 
 */
public class WeatherSimulationEvent extends AbstractSimulationEvent {

	/**
	 * 
	 */
	public WeatherSimulationEvent(final long relativeTimeOffset) {
		super(relativeTimeOffset);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationEvent#convertToSimulationObject()
	 */
	@Override
	public SimulationObject convertToSimulationObject() {
		return new WeatherSimulationObject();
	}
}
