package com.bb.commons.http.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.HttpClients;

/**
 * Utility class for connecting to a URL and retrieving the status code.
 * 
 * @author Mahesh.Yadav@blueberry.ai
 * @version 1.0
 */
public class ConnectorUtil {

	/**
	 * Connects to the specified URL and retrieves the HTTP status code.
	 * 
	 * @param url            the URL to connect to
	 * @param authentication the authentication configuration to use (optional)
	 * @return the HTTP status code
	 */
	public static Integer connect(String url, Authentication authentication) {
		AuthenticationEvaluator authenticationEvaluator = new AuthenticationEvaluator();
		authenticationEvaluator.validateAuth(authentication);
		HttpClient httpClient = HttpClients.createDefault();
		HttpHead httpHead = new HttpHead(url);
		authenticationEvaluator.addAuthentication(url, authentication, httpHead);
		HttpResponse response = null;
		Integer statusCode = 500; // Default to server error
		try {
			response = httpClient.execute(httpHead);
			if (response != null) {
				statusCode = response.getStatusLine().getStatusCode();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return statusCode;
	}
}
