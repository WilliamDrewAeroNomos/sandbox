package com.aeronomos.heartbeat;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * 
 *         $Id: HeartbeatService.java 226 2012-07-28 00:51:03Z  $
 * 
 */
public interface HeartbeatService {

	/**
	 * @throws AeroNomosException
	 * 
	 */
	void start() throws AeroNomosException;

	/**
	 * 
	 */
	void stop();

}
