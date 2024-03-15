package com.bb.commons;


/**
 * Enumeration classes defining various types, statuses, and metadata for a
 * storage service.
 * 
 * @author Mahesh Yadav
 * @version 1.0
 */
public class Enums {

	/**
	 * Enumeration for different file types.
	 */
	public static enum FileType {
		JSON("json"), XML("xml"), RSS("rss");

		private String fileType;

		private FileType(String fileType) {
			this.fileType = fileType;
		}

		public String getFileType() {
			return fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}
	}

	/**
	 * Enumeration for different data types.
	 */
	public static enum DataType {
		INT("int"), STRING("string"), DECIMAL("decimal"), BOOLEAN("boolean");

		private String dataType;

		private DataType(String dataType) {
			this.dataType = dataType;
		}

		public String getDataType() {
			return dataType;
		}
	}

	/**
	 * Enumeration for different status types.
	 */
	public static enum Status {
		ON("on"), OFF("off");

		private String status;

		private Status(String status) {
			this.status = status;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	/**
	 * Enumeration for different frequency types.
	 */
	public enum FrequencyType {
		HOURLY("hourly", 60), DAILY("daily", 24 * 60), WEEKLY("weekly", 7 * 24 * 60), MONTHLY("monthly", 30 * 24 * 60),
		NONE("None", 0);

		private final String frequencyType;
		private final int minutesInPeriod;

		private FrequencyType(String frequencyType, int minutesInPeriod) {
			this.frequencyType = frequencyType;
			this.minutesInPeriod = minutesInPeriod;
		}

		public String getFrequencyType() {
			return frequencyType;
		}

		public int getMinutesInPeriod() {
			return minutesInPeriod;
		}
	}

	/**
	 * Enumeration for different HTTP method types.
	 */
	public enum MethodType {
		GET("hourly"), POST("weekly"), DAILY("daily"), MONTHLY("monthly");

		private String methodType;

		private MethodType(String methodType) {
			this.methodType = methodType;
		}

		public String getMethodType() {
			return methodType;
		}
	}

	/**
	 * Enumeration for metadata associated with connectors.
	 */
	public enum ConnectorMetadata {
		RSS_NAME("RSS Name"), RSS_URL("RSS Url"), API_URL("API Url"), METHOD("Method"), QUERY("Query"), NAME("Name"),
		ROOT_NODE("Root node for splitting"), BODY_ENABLED(""), PAGING_OPTION_ENABLED(""), SMART_SCHEDULING_ENABLED(""),
		AUTH_OPTION_ENABLED(""), SETTING_OPTION_ENABLED("");

		private final String value;

		ConnectorMetadata(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}

	}
}
