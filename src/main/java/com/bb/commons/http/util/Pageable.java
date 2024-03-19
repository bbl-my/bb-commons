package com.bb.commons.http.util;

import java.util.HashMap;
import java.util.Map;

import com.bb.commons.enums.PageType;
import com.bb.commons.enums.PageValue;

public class Pageable {

	private PageType pageType;

	private Map<PageValue, String> pageValues = new HashMap<>();

	public PageType getPageType() {
		return pageType;
	}

	public void setPageType(PageType pageType) {
		this.pageType = pageType;
	}

	public Map<PageValue, String> getPageValues() {
		return pageValues;
	}

	public void setPageValues(Map<PageValue, String> pageValues) {
		this.pageValues = pageValues;
	}

}
