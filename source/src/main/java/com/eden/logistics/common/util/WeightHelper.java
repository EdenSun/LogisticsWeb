package com.eden.logistics.common.util;

import org.apache.log4j.Logger;

public class WeightHelper {
	private static Logger logger = Logger.getLogger(WeightHelper.class);
	public static Integer tonToGram(Float goodsWeight) {
		try {
			if( goodsWeight == null ){
				return null;
			}
			
			return (int)(goodsWeight*1000*1000);
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

}
