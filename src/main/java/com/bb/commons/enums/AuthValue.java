package com.bb.commons.enums;


/**
 * Enum representing different authentication values associated with AuthType
 * for a storage service.
 * 
 * @author Mahesh Yadav
 * @version 1.0
 */
public enum AuthValue {
	URL_AUTH_TOKEN("URL Token Value"), URL_PLACEHOLDER_TEXT("URL Token Placeholder"), HEADER_AUTH("Header Name"),
	HEADER_TOKEN("Header Value");

	private final String value;

	/**
	 * Constructor for AuthValue enum.
	 *
	 * @param value The string representation of the authentication value.
	 */
	AuthValue(String value) {
		this.value = value;
	}

	/**
	 * Get the string representation of the authentication value.
	 *
	 * @return The authentication value.
	 */
	public String getValue() {
		return value;
	}
}
