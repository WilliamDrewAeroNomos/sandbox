package com.aeronomos.request;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public interface RequestService {

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
