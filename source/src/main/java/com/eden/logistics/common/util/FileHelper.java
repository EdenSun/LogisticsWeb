package com.eden.logistics.common.util;

import java.util.Date;

public class FileHelper {
	
	public static String getSuffix(String fileName) {
		if( fileName == null ){
			return null;
		}
		if( fileName.contains(".") ){
			return fileName.substring(fileName.lastIndexOf(".")+1);
		}else{
			return "";
		}
	}

	public static String getFileRelativePath(){
		Date now = new Date();
		int year = DateUtil.getYear(now);
		int month = DateUtil.getMonth(now);
		String relativePath = year + "/" + month;
		return relativePath;
	}
	
	public static String getUniqueFileName(String suffix) {
		if( suffix == null ){
			return UUIDUtil.getUUID();
		}else{
			return UUIDUtil.getUUID() + "." + suffix;
		}
	}


}
