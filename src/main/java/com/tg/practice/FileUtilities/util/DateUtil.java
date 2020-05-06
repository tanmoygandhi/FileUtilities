package com.tg.practice.FileUtilities.util;

import java.util.Date;

//import org.apache.log4j.Logger;

public class DateUtil {
	
//	private static final org.apache.log4j.Logger LOGGER = Logger.getLogger(DateUtil.class);
	
	public static String convertLongValueToDate(long longValue) {
		
		String convertedDate = new Date(longValue).toString();
//		LOGGER.info("Converted date for received " + longValue + " = " + convertedDate);
		return convertedDate;
	}
	
	public static long convertDateToMiliseconds() {
		long dateMiliSecs = Long.MIN_VALUE;
		Date date = new Date();
		dateMiliSecs = date.getTime();
		System.out.println("Long miliseconds format of current date = " + dateMiliSecs);
		return dateMiliSecs;
	}

}
