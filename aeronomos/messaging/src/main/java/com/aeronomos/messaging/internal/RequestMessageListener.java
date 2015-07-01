/**
 * 
 */
package com.aeronomos.messaging.internal;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aeronomos.commons.exception.AeroNomosException;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class RequestMessageListener implements MessageListener {

	private final static Logger LOG = LoggerFactory
			.getLogger(RequestMessageListener.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.jms.MessageListener#onMessage(javax.jms.Message)
	 */
	@Override
	public void onMessage(Message message) {

		LOG.debug("Request message received");

		try {

			LOG.debug("Request message received");

			if (message == null) {
				throw new AeroNomosException(
						"Message received in RequestMessageListener was null.");
			}

			if (!(message instanceof TextMessage)) {
				throw new AeroNomosException(
						"Message received in RequestMessageListener was null.");
			}

			TextMessage tm = (TextMessage) message;

			String xmlContent = tm.getText();

			LOG.debug("Event - [" + xmlContent + "]");

		} catch (Throwable t) {
			// have to catch everything
		}
	}
}
