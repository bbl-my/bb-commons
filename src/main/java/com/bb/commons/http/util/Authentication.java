package com.bb.commons.http.util;

import java.util.HashMap;
import java.util.Map;

import com.bb.commons.enums.AuthType;
import com.bb.commons.enums.AuthValue;

public class Authentication {

	private AuthType authType;
	private Map<AuthValue, String> authValues = new HashMap<>();

	public AuthType getAuthType() {
		return authType;
	}

	public void setAuthType(AuthType authType) {
		this.authType = authType;
	}

	public Map<AuthValue, String> getAuthValues() {
		return authValues;
	}

	public void setAuthValues(Map<AuthValue, String> authValues) {
		this.authValues = authValues;
	}

	@Override
	public String toString() {
		return "Authentication [authType=" + authType + ", metadata=" + authValues + "]";
	}

}