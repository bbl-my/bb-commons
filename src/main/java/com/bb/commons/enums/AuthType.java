package com.bb.commons.enums;


/**
 * Enum representing different authentication types for a storage service.
 * 
 * @author Mahesh Yadav
 * @version 1.0
 */
public enum AuthType {
	URL("URL", AuthValue.URL_AUTH_TOKEN, AuthValue.URL_PLACEHOLDER_TEXT),
	HEADER("HEADER", AuthValue.HEADER_AUTH, AuthValue.HEADER_TOKEN), NONE("NONE");

	private final String authType;
	private final AuthValue[] associatedValues;

	/**
	 * Constructor for AuthType enum.
	 *
	 * @param authType         The string representation of the authentication type.
	 * @param associatedValues Associated values for the authentication type.
	 */
	private AuthType(String authType, AuthValue... associatedValues) {
		this.authType = authType;
		this.associatedValues = associatedValues;
	}

	/**
	 * Get the string representation of the authentication type.
	 *
	 * @return The authentication type.
	 */
	public String getAuthType() {
		return authType;
	}

	/**
	 * Get the associated values for the authentication type.
	 *
	 * @return Array of associated values.
	 */
	public AuthValue[] getAssociatedValues() {
		return associatedValues;
	}
}
