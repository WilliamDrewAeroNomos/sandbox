/**
 * 
 */
package com.aeronomos.request.internal;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 235 $
 * 
 */
public class CreateUserRequestHandler extends AbstractMessageHandler {

	private final Logger LOG = LoggerFactory
			.getLogger(CreateUserRequestHandler.class.getName());

	/**
	 * 
	 */
	public CreateUserRequestHandler() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.csc.muthur.eventserver.internal.IEventHandler#handle()
	 */
	@Override
	public void handle() throws AeroNomosException {

		LOG.debug("Handling create user request...");

		Message m = getMessage();

		if (!(m instanceof TextMessage)) {
			throw new AeroNomosException(
					"Encountered unexpected message type in CreateUserRequestHandler. Expected TextMessage.");
		}
		
		TextMessage tm = (TextMessage) m;
		
		
		

		LOG.debug("Handled create user request.");

	}

}
