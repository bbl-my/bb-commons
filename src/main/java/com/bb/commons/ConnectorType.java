package com.bb.commons;

import com.bb.commons.Enums.ConnectorMetadata;

/**
 * Enum representing different connector types for a storage service.
 * 
 * @author Mahesh Yadav
 * @version 1.0
 */
public enum ConnectorType {
	RSS("RSS", ConnectorMetadata.RSS_NAME, ConnectorMetadata.RSS_URL, ConnectorMetadata.BODY_ENABLED,
			ConnectorMetadata.SMART_SCHEDULING_ENABLED),
	API("API", ConnectorMetadata.API_URL, ConnectorMetadata.ROOT_NODE, ConnectorMetadata.PAGING_OPTION_ENABLED,
			ConnectorMetadata.AUTH_OPTION_ENABLED, ConnectorMetadata.SETTING_OPTION_ENABLED);

	private final String connectorType;
	private final ConnectorMetadata[] associatedValues;

	/**
	 * Constructor for ConnectorType enum.
	 *
	 * @param connectorType    The string representation of the connector type.
	 * @param associatedValues Associated values for the connector type.
	 */
	private ConnectorType(String connectorType, ConnectorMetadata... associatedValues) {
		this.connectorType = connectorType;
		this.associatedValues = associatedValues;
	}

	/**
	 * Get the string representation of the connector type.
	 *
	 * @return The connector type.
	 */
	public String getConnectorType() {
		return connectorType;
	}

	/**
	 * Get the associated values for the connector type.
	 *
	 * @return Array of associated values.
	 */
	public ConnectorMetadata[] getAssociatedValues() {
		return associatedValues;
	}
}
