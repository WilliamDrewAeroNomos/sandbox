package com.aeronomos;

import java.util.concurrent.Callable;

/**
 * 
 * @author williamdrew
 * 
 */
public class SimulationEventToSimObjectConverter implements
		Callable<SimulationObject> {

	private SimulationEvent simulationEvent;

	public SimulationEventToSimObjectConverter(
			final SimulationEvent simulationEvent) {
		this.simulationEvent = simulationEvent;
	}

	@Override
	public SimulationObject call() throws Exception {

		SimulationObject simObject = simulationEvent.convertToSimulationObject();

		System.out.println("Simulation event [" + simulationEvent + "]");
		return simObject;
	}

}
