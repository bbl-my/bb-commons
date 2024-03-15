package com.bb.commons.enums;


/**
 * Enum representing different page values for pagination.
 *
 * @author Mahesh Yadav
 * @version 1.0
 */
public enum PageValue {
	/**
	 * Offset/Page path from the response.
	 */
	OFFSET_RESPONSE_PATH("Enter the offset/page path from response"),

	/**
	 * Offset/Page token in the URL.
	 */
	OFFSET_URL_NAME("Enter the offset/page parameter in url"),

	/**
	 * Limit for data.
	 */
	LIMIT_VALUE("Enter the limit of data to fetch"),

	/**
	 * Limit token in the URL.
	 */
	LIMIT_URL_TOKEN("Enter the limit paramter in url"),

	/**
	 * Start time token in the URL.
	 */
	TIME_START("Start time token in the URL"),

	/**
	 * End time token in the URL.
	 */
	TIME_END("End time token in the URL"),

	/**
	 * Header path in the response.
	 */
	HEADER_PATH("Enter the header name to use"),

	/**
	 * Full URL path in the response.
	 */
	FULL_URL_PATH("Enter the url value path from the response"),

	TEMPLATE_APPEND("Enter the template to add in url"),

	TEMPLATE_PAGE_PLACEHOLDER("Enter the page parameter in template"),

	TEMPLATE_LIMIT_PLACEHOLER("Enter the limit paramter in template");

	private final String value;

	/**
	 * Constructs a PageValue enum constant.
	 *
	 * @param value The description of the page value.
	 */
	PageValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the description of the page value.
	 *
	 * @return The description of the page value.
	 */
	public String getValue() {
		return value;
	}
}
