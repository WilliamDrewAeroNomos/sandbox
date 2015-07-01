/**
 * 
 */
package com.aeronomos;

/**
 * @author williamdrew
 * 
 */
public abstract class AbstractSimulationEvent implements SimulationEvent {

	private long relativeTimeOffset = 0L; // number of milliseconds offset from
											// the
											// scenario start timestamp that
											// this
											// event should be triggered

	/**
	 * 
	 */
	public AbstractSimulationEvent(final long relativeTimeOffset) {
		this.relativeTimeOffset = relativeTimeOffset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationEvent#getRelativeTimeOffset()
	 */
	@Override
	public long getRelativeTimeOffset() {
		return relativeTimeOffset;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.aeronomos.SimulationEvent#setRelateveTimeOffset(long)
	 */
	@Override
	public void setRelateveTimeOffset(long relativeTimeOffset) {
		this.relativeTimeOffset = relativeTimeOffset;

	}

}
