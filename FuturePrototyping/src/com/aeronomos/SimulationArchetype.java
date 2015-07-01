/**
 * 
 */
package com.aeronomos;

/**
 * @author williamdrew
 * 
 */
public interface SimulationArchetype {

	/**
	 * @return the simulationConfiguration
	 */
	SimulationConfiguration getSimulationConfiguration();

	/**
	 * @param simulationConfiguration
	 *            the simulationConfiguration to set
	 */
	void setSimulationConfiguration(
			SimulationConfiguration simulationConfiguration);

	/**
	 * @return the airspaceConfiguration
	 */
	AirspaceConfiguration getAirspaceConfiguration();

	/**
	 * @param airspaceConfiguration
	 *            the airspaceConfiguration to set
	 */
	void setAirspaceConfiguration(AirspaceConfiguration airspaceConfiguration);

	/**
	 * @return
	 */
	Scenario getScenario();

	/**
	 * @param scenario
	 */
	void setScenario(Scenario scenario);

	/**
	 * @return
	 */
	WeatherConfiguration getWeatherConfiguration();

	/*
	 * @param weatherConfiguration
	 */
	void setWeatherConfiguration(WeatherConfiguration weatherConfiguration);

}