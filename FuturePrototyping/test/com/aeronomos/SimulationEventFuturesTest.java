/**
 * 
 */
package com.aeronomos;

import static org.junit.Assert.fail;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author williamdrew
 * 
 */
public class SimulationEventFuturesTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ExecutorService executorService = Executors.newCachedThreadPool();

		SimulationEventTriggerComparator sec = new SimulationEventTriggerComparator();

		PriorityBlockingQueue<SimulationEvent> queuedSimulationEvents = new PriorityBlockingQueue<SimulationEvent>(
				10, sec);

		queuedSimulationEvents.add(new WeatherSimulationEvent(200));

		queuedSimulationEvents.add(new FixedWingAircraftSimulationEvent(10000));

		queuedSimulationEvents.add(new WeatherSimulationEvent(6000));

		queuedSimulationEvents.add(new FixedWingAircraftSimulationEvent(12000));

		while (queuedSimulationEvents.size() != 0) {
			SimulationEvent simEvent = queuedSimulationEvents.remove();
			System.out.println("Event trigger offset : ["
					+ simEvent.getRelativeTimeOffset() + "]");

			Future<SimulationObject> future = executorService
					.submit(new SimulationEventToSimObjectConverter(simEvent));

			try {
				SimulationObject simObject = future.get();
				System.out.println("SimulationObject = [" + simObject + "]");
			} catch (InterruptedException e) {
				fail(e.getLocalizedMessage());
			} catch (ExecutionException e) {
				fail(e.getLocalizedMessage());
			}

		}

		executorService.shutdown();
	}

}
