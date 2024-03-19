package com.bb.commons.http.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.impl.client.HttpClients;

public class ConnectorUtil {

	public static Integer connect(String url, Authentication authentication) {
		AuthenticationEvaluator authenticationEvaluator = new AuthenticationEvaluator();
		authenticationEvaluator.vadlidateAuth(authentication);
		HttpClient httpClient = HttpClients.createDefault();
		HttpHead httpHead = new HttpHead(url);
		authenticationEvaluator.addAuthentication(url, authentication, httpHead);
		HttpResponse response = null;
		Integer statusCode = 500;
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
