/**
 * 
 */
package com.aeronomos;

import java.util.Date;

/**
 * @author williamdrew
 *
 */
public interface Scenario {

	/**
	 * Time that the simulation time should start which is not related to the actual time of the simulation execution. 
	 * @return
	 */
	Date getSimulationStartTimestamp();	
}
