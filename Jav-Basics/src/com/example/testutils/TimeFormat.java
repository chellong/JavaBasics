package com.example.testutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFormat {
	
	public static void main(String[] args) {
		
		/**
		 * 
		 * ��ʱ��ת�����ַ���
		 * 
		 */
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss,���ڽ���ĵ�w�ܣ�"
				+ "���ڱ��µĵ�W��");
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
