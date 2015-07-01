/**
 * 
 */
package com.aeronomos.request.internal;

import javax.jms.Message;

import org.aeronomos.model.commonTypes.MessageType;

/**
 * 
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 265 $
 * 
 */
public abstract class AbstractMessageHandler implements IMessageHandler {

	private MessageType messageType;

	private Message message;

	private String errorDescription;

	/**
	 * 
	 */
	public AbstractMessageHandler() {
	}

	@Override
	public void setMessage(final Message m) {
		this.message = m;
	}

	/**
	 * @return Returns the messageType.
	 */
	public MessageType getEvent() {
		return this.messageType;
	}

	/**
	 * @return Returns the message.
	 */
	public Message getMessage() {
		return this.message;
	}

	/**
	 * @param messageType
	 *          the messageType to set
	 */
	public final void setEvent(MessageType event) {
		this.messageType = event;
	}

	/**
	 * @param errorDescription
	 *          the errorDescription to set
	 */
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	/**
	 * @return the errorDescription
	 */
	public String getErrorDescription() {
		return errorDescription;
	}

}
