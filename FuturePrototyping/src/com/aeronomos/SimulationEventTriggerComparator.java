/**
 * 
 */
package com.aeronomos;

import java.util.Comparator;

/**
 * @author williamdrew
 * 
 */
public class SimulationEventTriggerComparator implements
		Comparator<SimulationEvent> {

	/**
	 * 
	 */
	public SimulationEventTriggerComparator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(SimulationEvent o1, SimulationEvent o2) {
		if ((o1 == null) || (o2 == null)) {
			System.err
					.println("Null value passed to SimulationEventComparator.compare()");
			return 0;
		}

		if (o1.getRelativeTimeOffset() < o2.getRelativeTimeOffset()) {
			return -1;
		}

		if (o1.getRelativeTimeOffset() > o2.getRelativeTimeOffset()) {
			return 1;
		}

		return 0;
	}

}
