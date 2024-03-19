package com.bb.commons.http.util;

import java.net.URI;
import java.util.Arrays;
import java.util.Map;

import org.apache.http.client.methods.HttpRequestBase;

import com.bb.commons.enums.AuthType;
import com.bb.commons.enums.AuthValue;
import com.bb.commons.exception.ConfigurationException;

public class AuthenticationEvaluator {

	public void addAuthentication(String url, Authentication authentication, HttpRequestBase httpRequest) {
		vadlidateAuth(authentication);
		if (AuthType.URL.equals(authentication.getAuthType())) {
			String token = authentication.getAuthValues().get(AuthValue.URL_AUTH_TOKEN);
			String tokenToBeReplaced = authentication.getAuthValues().get(AuthValue.URL_PLACEHOLDER_TEXT);
			httpRequest.setURI(URI.create(url.replace(tokenToBeReplaced, token)));
		} else if (AuthType.HEADER.equals(authentication.getAuthType())) {
			httpRequest.addHeader(authentication.getAuthValues().get(AuthValue.HEADER_AUTH),
					authentication.getAuthValues().get(AuthValue.HEADER_TOKEN));
		}
	}

	public void vadlidateAuth(Authentication authentication) {
		AuthType authType = authentication.getAuthType();
		if (authType == null) {
			throw new ConfigurationException("Authentication not configured properly. AuthType is missing.");
		}
		Map<AuthValue, String> metadata = authentication.getAuthValues();
		boolean allKeysPresent = Arrays.stream(authType.getAssociatedValues()).allMatch(metadata::containsKey);
		if (!allKeysPresent) {
			throw new ConfigurationException(
					"Authentication not configured properly. Check the values required for AuthType " + authType
							+ ". Passed " + metadata.keySet() + ". Required " + authType.getAssociatedValues());
		}
	}
}
