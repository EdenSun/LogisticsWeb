package com.eden.logistics.common.util;

import org.apache.log4j.Logger;

public class CurrencyHelper {
	private static Logger logger = Logger.getLogger(CurrencyHelper.class);

	public static Integer yuanToFen(Integer zhengChePrice) {
		try {
			if( zhengChePrice == null ){
				return null;
			}
			return zhengChePrice * 100;
		} catch (Exception e) {
			logger.error(e);
			return null;
		}
	}

}
