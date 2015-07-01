package com.aeronomos;

public class FixedWingAircraftSimulationObject implements SimulationObject {

	public FixedWingAircraftSimulationObject() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationObject#update()
	 */
	@Override
	public void update() throws Exception {
		System.out.println("FlightSimulationObject updated.");
	}

}
