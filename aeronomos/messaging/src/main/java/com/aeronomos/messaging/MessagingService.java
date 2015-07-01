/**
 * 
 */
package com.aeronomos.messaging;

import javax.jms.JMSException;

import com.aeronomos.commons.exception.AeroNomosException;
import com.aeronomos.configuration.ConfigurationService;

/**
 * 
 * $Id: MessagingService.java 217 2012-07-27 18:52:50Z  $
 * 
 */
public interface MessagingService {

	/**
	 * @throws AeroNomosException
	 * 
	 */
	void start() throws AeroNomosException;

	/**
	 * @throws AeroNomosException
	 * 
	 */
	void stop() throws AeroNomosException;

	/**
	 * @throws Exception
	 */
	void startConsumer() throws JMSException;

	/**
	 * @throws Exception
	 */
	void stopConsumer() throws JMSException;

	/**
	 * Used by Spring to inject a reference to the {@link ConfigurationService}
	 * 
	 * @param configurationService
	 */
	void setConfigurationService(ConfigurationService configurationService);

	/**
	 * Returns a reference to the {@link ConfigurationService}
	 * 
	 * @param configurationService
	 */
	ConfigurationService getConfigurationService();

}
