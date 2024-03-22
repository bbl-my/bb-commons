package com.bb.commons.message;

import java.util.UUID;

/**
 * Represents a vector message containing an ID, transformed file path, and
 * client ID.
 * 
 * @author Mahesh.Yadav@blueberrylabs.ai
 * @version 1.0
 */
public class VectorMessage {

	private UUID id;

	private String transformedFilePath;

	private String clientId;

	/**
	 * Get the ID of the vector message.
	 * 
	 * @return the ID
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Set the ID of the vector message.
	 * 
	 * @param id the ID to set
	 */
	public void setId(UUID id) {
		this.id = id;
	}

	/**
	 * Get the transformed file path.
	 * 
	 * @return the transformed file path
	 */
	public String getTransformedFilePath() {
		return transformedFilePath;
	}

	/**
	 * Set the transformed file path.
	 * 
	 * @param transformedFilePath the transformed file path to set
	 */
	public void setTransformedFilePath(String transformedFilePath) {
		this.transformedFilePath = transformedFilePath;
	}

	/**
	 * Get the client ID.
	 * 
	 * @return the client ID
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * Set the client ID.
	 * 
	 * @param clientId the client ID to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}
