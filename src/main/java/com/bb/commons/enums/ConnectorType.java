package com.bb.commons.enums;

import java.util.Set;

import com.bb.commons.enums.Enums.ConnectorMetadata;
import com.bb.commons.enums.Enums.FileType;

/**
 * Enum representing different connector types for a storage service.
 * 
 * @author Mahesh.Yadav@blueberry.ai
 * @version 1.0
 */
public enum ConnectorType {

	RSS("RSS",
			Set.of(ConnectorMetadata.RSS_NAME, ConnectorMetadata.RSS_URL, ConnectorMetadata.BODY_ENABLED,
					ConnectorMetadata.SMART_SCHEDULING_ENABLED),
			Set.of(FileType.RSS)),
	API("API",
			Set.of(ConnectorMetadata.API_URL, ConnectorMetadata.ROOT_NODE, ConnectorMetadata.PAGING_OPTION_ENABLED,
					ConnectorMetadata.AUTH_OPTION_ENABLED, ConnectorMetadata.SETTING_OPTION_ENABLED),
			Set.of(FileType.XML, FileType.JSON));

	private final String connectorType;

	private final Set<ConnectorMetadata> associatedValues;

	private final Set<FileType> fileTypes;

	/**
	 * Constructor for ConnectorType enum.
	 *
	 * @param connectorType    The string representation of the connector type.
	 * @param associatedValues Associated values for the connector type.
	 */
	private ConnectorType(String connectorType, Set<ConnectorMetadata> associatedValues, Set<FileType> fileTypes) {
		this.connectorType = connectorType;
		this.associatedValues = associatedValues;
		this.fileTypes = fileTypes;
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
	public Set<ConnectorMetadata> getAssociatedValues() {
		return associatedValues;
	}

	public Set<FileType> getFileTypes() {
		return fileTypes;
	}
}
