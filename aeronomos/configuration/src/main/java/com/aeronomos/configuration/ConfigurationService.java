/**
 * 
 */
package com.aeronomos.configuration;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */

public interface ConfigurationService {

	void start() throws AeroNomosException;

	void stop();

	String getHeartbeatconfigurationtopicname();

}