/**
 * 
 */
package com.aeronomos;

/**
 * @author williamdrew
 * 
 */
public class SimulationArchetypeImpl implements SimulationArchetype {

	private SimulationConfiguration simulationConfiguration;
	private AirspaceConfiguration airspaceConfiguration;
	private WeatherConfiguration weatherConfiguration;
	private Scenario scenario;

	/**
	 * 
	 * @param simulationConfiguration
	 * @param airspaceConfiguration
	 * @param scenario
	 */
	public SimulationArchetypeImpl(
			final SimulationConfiguration simulationConfiguration,
			final AirspaceConfiguration airspaceConfiguration,
			final WeatherConfiguration weatherConfiguration,
			final Scenario scenario) {
		super();
		this.simulationConfiguration = simulationConfiguration;
		this.airspaceConfiguration = airspaceConfiguration;
		this.weatherConfiguration = weatherConfiguration;
		this.scenario = scenario;
	}

	/**
	 * 
	 */
	public SimulationArchetypeImpl() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationArchetype#getSimulationConfiguration()
	 */
	@Override
	public SimulationConfiguration getSimulationConfiguration() {
		return simulationConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationArchetype#setSimulationConfiguration(com.aeronomos
	 * .SimulationConfiguration)
	 */
	@Override
	public void setSimulationConfiguration(
			SimulationConfiguration simulationConfiguration) {
		this.simulationConfiguration = simulationConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationArchetype#getAirspaceConfiguration()
	 */
	@Override
	public AirspaceConfiguration getAirspaceConfiguration() {
		return airspaceConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationArchetype#setAirspaceConfiguration(com.aeronomos
	 * .AirspaceConfiguration)
	 */
	@Override
	public void setAirspaceConfiguration(
			AirspaceConfiguration airspaceConfiguration) {
		this.airspaceConfiguration = airspaceConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationArchetype#getScenario()
	 */
	@Override
	public Scenario getScenario() {
		return scenario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationArchetype#setScenario(com.aeronomos.Scenario)
	 */
	@Override
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationArchetype#getWeatherConfiguration()
	 */
	@Override
	public WeatherConfiguration getWeatherConfiguration() {
		return weatherConfiguration;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationArchetype#setWeatherConfiguration(com.aeronomos
	 * .WeatherConfiguration)
	 */
	@Override
	public void setWeatherConfiguration(
			WeatherConfiguration weatherConfiguration) {
		this.weatherConfiguration = weatherConfiguration;
	}

}
