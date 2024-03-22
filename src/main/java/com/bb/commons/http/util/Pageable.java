package com.bb.commons.http.util;

import java.util.HashMap;
import java.util.Map;

import com.bb.commons.enums.PageType;
import com.bb.commons.enums.PageValue;

/**
 * Represents pageable configurations for HTTP requests.
 * 
 * @author Mahesh.Yadav@blueberrylabs.ai
 * @version 1.0
 */
public class Pageable {

	private PageType pageType;

	private Map<PageValue, String> pageValues = new HashMap<>();

	/**
	 * Get the page type.
	 * 
	 * @return the page type
	 */
	public PageType getPageType() {
		return pageType;
	}

	/**
	 * Set the page type.
	 * 
	 * @param pageType the page type
	 */
	public void setPageType(PageType pageType) {
		this.pageType = pageType;
	}

	/**
	 * Get the page values.
	 * 
	 * @return the page values
	 */
	public Map<PageValue, String> getPageValues() {
		return pageValues;
	}

	/**
	 * Set the page values.
	 * 
	 * @param pageValues the page values
	 */
	public void setPageValues(Map<PageValue, String> pageValues) {
		this.pageValues = pageValues;
	}
}
