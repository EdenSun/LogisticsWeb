package com.eden.logistics.common.util;

public class RadomNumberHelper {

	public static int get6BitRadomNumber(){
		return (int)((Math.random()*9+1)*100000);
	}

	public static void main(String[] args){
		System.out.println(RadomNumberHelper.get6BitRadomNumber());
	}
}
