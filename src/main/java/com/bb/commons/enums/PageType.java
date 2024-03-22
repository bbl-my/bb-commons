package com.bb.commons.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bb.commons.enums.Enums.FileType;

/**
 * Enum representing different page types for pagination.
 *
 * @author Mahesh.Yadav@blueberrylabs.ai
 * @version 1.0
 */
public enum PageType {

	/**
	 * Offset/Page-based pagination. Associated values: OFFSET_PATH, OFFSET_TOKEN,
	 * LIMIT, LIMIT_TOKEN.
	 */
	CURSOR("Cursor",
			Arrays.asList(PageValue.OFFSET_RESPONSE_PATH, PageValue.OFFSET_URL_NAME, PageValue.LIMIT_VALUE,
					PageValue.LIMIT_URL_TOKEN)),

	/**
	 * Header-based pagination. No associated values.
	 */
	HEADER("", Arrays.asList()),
	/**
	 * Url-based pagination. No associated values.
	 */
	URL("Url", Arrays.asList(PageValue.FULL_URL_PATH)),

	REPLACE_PARAMETER("Parameter replace",
			Arrays.asList(PageValue.TEMPLATE_APPEND, PageValue.TEMPLATE_PAGE_PLACEHOLDER,
					PageValue.TEMPLATE_LIMIT_PLACEHOLER, PageValue.OFFSET_RESPONSE_PATH, PageValue.LIMIT_VALUE)),
	/**
	 * No pagination strategy. No associated values.
	 */
	NONE("NONE", Arrays.asList());

	private final String pageType;
	private final List<PageValue> associatedValues;

	private static final Map<FileType, List<PageType>> PAGE_TYPE_MAPPING = new HashMap<>();

	static {
		PAGE_TYPE_MAPPING.put(FileType.JSON, Arrays.asList(PageType.HEADER, PageType.CURSOR, PageType.REPLACE_PARAMETER,
				PageType.URL, PageType.NONE));
	}

	/**
	 * Constructs a PageType enum constant.
	 *
	 * @param pageType The display name or identifier for the page type.
	 * @param list     The associated PageValue constants.
	 */
	private PageType(String pageType, List<PageValue> list) {
		this.pageType = pageType;
		this.associatedValues = list;
	}

	/**
	 * Gets the display name or identifier for the page type.
	 *
	 * @return The page type.
	 */
	public String getPageType() {
		return pageType;
	}

	/**
	 * Gets the associated PageValue constants for the page type.
	 *
	 * @return An array of associated PageValue constants.
	 */
	public List<PageValue> getAssociatedValues() {
		return associatedValues;
	}

	/**
	 * Get the associated PageTypes for a given key.
	 *
	 * @param key The mapping key (e.g., "XML", "JSON").
	 * @return A list of associated PageTypes.
	 */
	public static List<PageType> getPageTypes(FileType key) {
		return PAGE_TYPE_MAPPING.getOrDefault(key, Arrays.asList());
	}
}
