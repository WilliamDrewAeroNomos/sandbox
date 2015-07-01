/**
 * 
 */
package com.aeronomos;

import java.util.List;

/**
 * @author williamdrew
 *
 */
public interface SimulationObjectUpdater {

	void addSimulationObjects(List<SimulationObject> simulationObjects);

	void addSimulationObject(SimulationObject simulationObject);

	void updateSimulationObjects();

	/**
	 * 
	 */
	void updateObjects();

}