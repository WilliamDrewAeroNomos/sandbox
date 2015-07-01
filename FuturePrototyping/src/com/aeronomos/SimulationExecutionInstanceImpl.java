/**
 * 
 */
package com.aeronomos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author <a href=mailto:support@aeronomos.org>aeronomos</a>
 * @version %I%, %G%
 * @since 1.0
 * 
 *        $Id: $
 * 
 * 
 */
public class SimulationExecutionInstanceImpl implements
		SimulationExecutionInstance {

	private ExecutorService executorService;

	private SimulationEventTriggerComparator sec;

	private Thread simulationEventQueueProcessorThread;
	private SimulationEventQueueProcessorImpl simulationEventQueueProcessor;
	private PriorityBlockingQueue<SimulationEvent> simulationEventQueue;

	private Scenario scenario;
	private AirspaceConfiguration airspaceConfiguration;
	private SimulationConfiguration simulationConfiguration;

	Calendar startingSimulationTimestamp = new GregorianCalendar();
	Calendar currentSimulationTimestamp = new GregorianCalendar();

	private WeatherConfiguration weatherConfiguration;

	private Thread simulationExecutionLoopThread;
	private SimulationExecutionLoopImpl simulationExecutionLoop;

	/**
	 * 
	 */
	public SimulationExecutionInstanceImpl(
			final SimulationArchetype simulationArchetype) {
		super();

		if (simulationArchetype == null) {
			throw new IllegalArgumentException("SimulationArchetype parameter to "
					+ "SimulationExecutionInstanceImpl ctor was null");
		}

		scenario = simulationArchetype.getScenario();

		if (scenario == null) {
			throw new IllegalArgumentException(
					"Scenario in SimulationArchetype parameter to "
							+ "SimulationExecutionInstanceImpl ctor was null");
		}

		startingSimulationTimestamp.setTime(scenario.getSimulationStartTimestamp());

		currentSimulationTimestamp.setTime(scenario.getSimulationStartTimestamp());

		airspaceConfiguration = simulationArchetype.getAirspaceConfiguration();

		if (airspaceConfiguration == null) {
			throw new IllegalArgumentException(
					"AirspaceConfiguration in SimulationArchetype parameter to "
							+ "SimulationExecutionInstanceImpl ctor was null");
		}

		simulationConfiguration = simulationArchetype.getSimulationConfiguration();

		if (simulationConfiguration == null) {
			throw new IllegalArgumentException(
					"SimulationConfiguration in SimulationArchetype parameter to "
							+ "SimulationExecutionInstanceImpl ctor was null");
		}

		weatherConfiguration = simulationArchetype.getWeatherConfiguration();

		if (weatherConfiguration == null) {
			throw new IllegalArgumentException(
					"WeatherConfiguration in SimulationArchetype parameter to "
							+ "SimulationExecutionInstanceImpl ctor was null");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationExecutor#start()
	 */
	@Override
	public void start() {

		executorService = Executors.newCachedThreadPool();

		sec = new SimulationEventTriggerComparator();

		setQueuedSimulationEvents(new PriorityBlockingQueue<SimulationEvent>(10,
				sec));

		/*
		 * Start the simulation event queue processor
		 */
		simulationEventQueueProcessor = new SimulationEventQueueProcessorImpl(this);

		simulationEventQueueProcessorThread =
				new Thread(simulationEventQueueProcessor,
						"SimulationEventsQueueProcessorThread");

		simulationEventQueueProcessorThread.start();

		/*
		 * Start the simulation execution loop thread
		 */
		simulationExecutionLoop = new SimulationExecutionLoopImpl(this);

		simulationExecutionLoopThread =
				new Thread(simulationExecutionLoop, "simulationExecutionLoopThread");

		simulationExecutionLoopThread.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationExecutor#stop()
	 */
	@Override
	public void stop() {

		if (executorService != null) {
			executorService.shutdown();
		}

		if (simulationEventQueueProcessor != null) {
			simulationEventQueueProcessor.setStillRunning(false);
		}

		if ((simulationEventQueueProcessorThread != null)
				&& (simulationEventQueueProcessorThread.isAlive())) {
			simulationEventQueueProcessorThread.interrupt();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationExecutionInstance#addEvent(com.aeronomos.
	 * SimulationEvent)
	 */
	@Override
	public void addEvent(SimulationEvent event) {
		if (event != null) {
			simulationExecutionLoop.addSimulationObject(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationExecutionInstance#getQueuedSimulationEvents()
	 */
	@Override
	public PriorityBlockingQueue<SimulationEvent> getQueuedSimulationEvents() {
		return getSimulationEventQueue();
	}

	private void setQueuedSimulationEvents(
			PriorityBlockingQueue<SimulationEvent> queuedSimulationEvents) {
		setSimulationEventQueue(queuedSimulationEvents);
	}

	/**
	 * @return the simulationConfiguration
	 */
	public SimulationConfiguration getSimulationConfiguration() {
		return simulationConfiguration;
	}

	/**
	 * @param simulationConfiguration
	 *          the simulationConfiguration to set
	 */
	public void setSimulationConfiguration(
			SimulationConfiguration simulationConfiguration) {
		this.simulationConfiguration = simulationConfiguration;
	}

	/**
	 * @return the scenario
	 */
	@Override
	public Scenario getScenario() {
		return scenario;
	}

	/**
	 * @return the currentSimulationTimestamp
	 */
	public Date getCurrentSimulationTimestamp() {
		return currentSimulationTimestamp.getTime();
	}

	/**
	 * @param newSimulationTimestamp
	 *          the newSimulationTimestamp to set
	 */
	public void setCurrentSimulationTimestamp(Date newSimulationTimestamp) {
		this.currentSimulationTimestamp.setTime(newSimulationTimestamp);
	}

	/**
	 * @return the simulationExecutionLoop
	 */
	@Override
	public SimulationExecutionLoop getSimulationExecutionLoop() {
		return simulationExecutionLoop;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationEventQueueProcessor#getSimulationEventQueue()
	 */
	@Override
	public PriorityBlockingQueue<SimulationEvent> getSimulationEventQueue() {
		return simulationEventQueue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationEventQueueProcessor#setSimulationEventQueue(java
	 * .util.concurrent.PriorityBlockingQueue)
	 */
	@Override
	public void setSimulationEventQueue(
			PriorityBlockingQueue<SimulationEvent> simulationEventQueue) {
		this.simulationEventQueue = simulationEventQueue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationEventQueueProcessor#addSimulationEvent(com.aeronomos
	 * .SimulationEvent)
	 */
	@Override
	public void addSimulationEvent(final SimulationEvent simulationEvent) {
		if (simulationEvent != null) {
			simulationEventQueue.add(simulationEvent);
		}
	}
}
