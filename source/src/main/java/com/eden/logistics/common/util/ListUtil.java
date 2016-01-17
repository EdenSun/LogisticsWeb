package com.eden.logistics.common.util;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	public static List<Integer> separateStringToIntList(String str,String separator){
		String strAry[] = str.split(separator);
		if( strAry != null ){
			List<Integer> list = new ArrayList<Integer>();
			
			for( String item: strAry ){
				Integer intItem = Integer.parseInt(item);
				list.add(intItem);
			}
			
			return list;
		}
		
		return null;
	}
}
