package com.eden.logistics.common.util;

import org.apache.log4j.Logger;

public class VolumeHelper {
	private static Logger logger = Logger.getLogger(WeightHelper.class);
	
	public static Integer cubicMeterToCubicCentimeter(Float goodsVolume) {
		try {
			if( goodsVolume == null ){
				return null;
			}
			
			return (int)(goodsVolume*1000*1000);
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

}
