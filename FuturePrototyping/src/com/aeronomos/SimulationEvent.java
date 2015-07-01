package com.aeronomos;

/**
 * 
 * @author williamdrew
 * 
 */
public interface SimulationEvent {

	long getRelativeTimeOffset();

	void setRelateveTimeOffset(final long relativeTimeOffset);

	SimulationObject convertToSimulationObject();
}
