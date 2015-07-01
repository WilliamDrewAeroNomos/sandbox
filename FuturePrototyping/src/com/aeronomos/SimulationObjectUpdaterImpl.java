/**
 * 
 */
package com.aeronomos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author williamdrew
 * 
 */
public class SimulationObjectUpdaterImpl implements SimulationObjectUpdater {

	private List<SimulationObject> simulationObjects = new ArrayList<SimulationObject>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationObjectUpdater#addSimulationObjects(java.util.
	 * List)
	 */
	@Override
	public void addSimulationObjects(
			final List<SimulationObject> simulationObjects) {
		simulationObjects.addAll(simulationObjects);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.aeronomos.SimulationObjectUpdater#addSimulationObject(com.aeronomos
	 * .SimulationObject)
	 */
	@Override
	public void addSimulationObject(final SimulationObject simulationObject) {
		simulationObjects.add(simulationObject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationObjectUpdater#updateSimulationObjects()
	 */
	@Override
	public void updateSimulationObjects() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationObjectUpdater#updateObjects()
	 */
	@Override
	public void updateObjects() {
		if ((simulationObjects != null) && !simulationObjects.isEmpty()) {
			for (SimulationObject simObj : simulationObjects) {
				if (simObj != null) {
					try {
						simObj.update();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}
}
