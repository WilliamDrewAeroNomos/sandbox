/**
 * 
 */
package com.aeronomos.commons.exception;

/**
 * 
 * @author <a href=mailto:support@aeronomos.com>aeronomos</a>
 * @version $Revision: 220 $
 * 
 */
public class AeroNomosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7397432648959128136L;

	/**
	 * 
	 */
	public AeroNomosException() {
	}

	/**
	 * @param message
	 */
	public AeroNomosException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public AeroNomosException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public AeroNomosException(String message, Throwable cause) {
		super(message, cause);
	}

}
