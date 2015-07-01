/**
 * 
 */
package com.aeronomos;

import java.util.Collection;

/**
 * @author williamdrew
 * 
 */
public class AirspaceConfigurationImpl implements AirspaceConfiguration {

	public AirspaceConfigurationImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Collection<AirspaceSector> airspaces;

	/**
	 * @return the airspaces
	 */
	public Collection<AirspaceSector> getAirspaces() {
		return airspaces;
	}

	/**
	 * @param airspaces
	 *            the airspaces to set
	 */
	public void setAirspaces(Collection<AirspaceSector> airspaces) {
		this.airspaces = airspaces;
	}
}
