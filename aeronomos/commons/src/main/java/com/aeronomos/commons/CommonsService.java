/**
 * 
 */
package com.aeronomos.commons;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */

public interface CommonsService {

	void start();

	void stop();

	/**
	 * Checks if a particular port is available
	 * 
	 * @param port
	 * @return true if the port is available
	 */
	boolean portAvailable(int port);

	/**
	 * Finds an available port between the minimum and maximum port numbers
	 * provided. -1 is returned if a port is not available in the given range.
	 * 
	 * @param minPort
	 * @param maxPort
	 * @return
	 */
	int findAvailablePort(final int minPort, final int maxPort);

}