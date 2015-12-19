package com.example.testutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * 将时间转化成字符串
		 * 
		 */
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,属于今年的第w周，"
				+ "属于本月的第W周");
		Date d = new Date();
		String str = df.format(d);
		System.out.println(str);
		
		
		System.out.println("888888888888888888888888888888888888888888888");
		
		DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		String st = "1993-09-05";
		
		try {
			Date d2 = dft.parse(st);
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
