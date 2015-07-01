/**
 * 
 */
package com.aeronomos.request.internal;

import javax.jms.Message;

import org.aeronomos.model.commonTypes.MessageType;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>>
 * 
 *         $Id: IMessageHandler.java 265 2012-08-06 01:18:12Z  $
 * 
 */
public interface IMessageHandler {

	/**
	 * 
	 * @throws Exception
	 */
	void handle() throws AeroNomosException;

	/**
	 * 
	 * @param m
	 */
	void setMessage(final Message m);

	/**
	 * @return Returns the event.
	 */
	abstract MessageType getEvent();

	/**
	 * @return Returns the message.
	 */
	Message getMessage();

	/**
	 * 
	 * @param event
	 */
	void setEvent(MessageType event);
}