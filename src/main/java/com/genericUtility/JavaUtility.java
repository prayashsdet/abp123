package com.genericUtility;

import java.util.Date;
import java.util.Random;



public class JavaUtility {
	//generate random number to avoid duplicate
	public static String getRandomDate() {
		Random random = new Random();
		int ran = random.nextInt(1000);
		return ""+ran;
		
	}
	//used to generate current date @return currentDate
	public static String getCurrentDate() {
		Date date = new Date();
		String currentdate = date.toString();
		return currentdate;
		
	}
}
