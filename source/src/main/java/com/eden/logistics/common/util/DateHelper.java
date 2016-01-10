package com.eden.logistics.common.util;

import java.util.Calendar;
import java.util.Date;


public class DateHelper {
	public static long secondDiff(Date date1, Date date2){
		return (date2.getTime() - date1.getTime())/1000;
	}

	public static int getYear(Date date) {
		if( date != null ){
			Calendar cal = Calendar.getInstance();
			return cal.get(Calendar.YEAR);
		}
		return 0;
	}

	public static int getMonth(Date date) {
		if( date != null ){
			Calendar cal = Calendar.getInstance();
			return cal.get(Calendar.MONTH) + 1;
		}
		return 0;
	}
	
	/*public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, 6);
		cal.set(Calendar.DAY_OF_MONTH, 13);
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE,56);
		cal.set(Calendar.SECOND,0);
		
		Date now = new Date();
		System.out.println(now);
		System.out.println(cal.getTime());
		
		System.out.println(DateUtil.secondDiff(new Date(), cal.getTime()));
	}*/
}
