package com.aeronomos;

/**
 * 
 * @author williamdrew
 * 
 */
public class WeatherSimulationObject implements SimulationObject {

	/**
	 * 
	 */
	public WeatherSimulationObject() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationObject#update()
	 */
	@Override
	public void update() throws Exception {
		System.out.println("WeatherSimulationObject updated.");
	}

}
