package com.eden.logistics.common.util;

public class PagerUtil {

	public static int getStart(int page, int pageSize) {
		return pageSize*(page-1);
	}

	public static Integer getPage(Integer start, Integer pageSize) {
		if( start != null && pageSize != null ){
			return (int)Math.ceil((double)start/pageSize);
		}
		return null;
	}

}
