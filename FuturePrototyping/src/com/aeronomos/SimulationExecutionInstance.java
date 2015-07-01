package com.aeronomos;

import java.util.concurrent.PriorityBlockingQueue;

public interface SimulationExecutionInstance {

	void start();

	void stop();

	void addEvent(final SimulationEvent event);

	PriorityBlockingQueue<SimulationEvent> getQueuedSimulationEvents();
}
