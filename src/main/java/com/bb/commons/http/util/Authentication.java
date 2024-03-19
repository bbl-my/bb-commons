package com.bb.commons.http.util;

import java.util.HashMap;
import java.util.Map;

import com.bb.commons.enums.AuthType;
import com.bb.commons.enums.AuthValue;

/**
 * Represents authentication details for HTTP requests.
 *
 * @author Mahesh.Yadav@blueberry.ai
 * @version 1.0
 */
public class Authentication {

	private AuthType authType;
	private Map<AuthValue, String> authValues = new HashMap<>();

	/**
	 * Retrieves the authentication type.
	 *
	 * @return the authentication type
	 */
	public AuthType getAuthType() {
		return authType;
	}

	/**
	 * Sets the authentication type.
	 *
	 * @param authType the authentication type to set
	 */
	public void setAuthType(AuthType authType) {
		this.authType = authType;
	}

	/**
	 * Retrieves the authentication values.
	 *
	 * @return the authentication values
	 */
	public Map<AuthValue, String> getAuthValues() {
		return authValues;
	}

	/**
	 * Sets the authentication values.
	 *
	 * @param authValues the authentication values to set
	 */
	public void setAuthValues(Map<AuthValue, String> authValues) {
		this.authValues = authValues;
	}

	/**
	 * Returns a string representation of the authentication details.
	 *
	 * @return a string representation of the authentication details
	 */
	@Override
	public String toString() {
		return "Authentication [authType=" + authType + ", metadata=" + authValues + "]";
	}
}
