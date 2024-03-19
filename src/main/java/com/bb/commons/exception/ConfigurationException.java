package com.bb.commons.exception;

/**
 * Exception thrown when there is an error related to configuration.
 * 
 * @author Mahesh.Yadav@blueberry.ai
 * @version 1.0
 */
public class ConfigurationException extends RuntimeException {

	private static final long serialVersionUID = 4234488647471832789L;

	/**
	 * Constructs a new ConfigurationException with the specified detail message.
	 *
	 * @param message the detail message (which is saved for later retrieval by the
	 *                getMessage() method)
	 */
	public ConfigurationException(String message) {
		super(message);
	}
}
