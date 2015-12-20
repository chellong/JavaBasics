package com.example.testutils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * ������ ���ڼ���
 * 
 * �·ݴ�0��ʼ����
 * 
 * һ�� ���� ���� ���� ...
 * 0      1   2    3   ...
 * 
 * ��
 *  
 *  ������ ����һ ���ڶ� ������ ������ ������ ������
 *  1		2		3		4		5
 * 
 * @author ���ɵĺ���
 *
 */
public class TestCalendar {
	
	public static void main(String[] args) {
		
		Calendar c = new GregorianCalendar();
		
		//c.set(2010, Calendar.FEBRUARY, 10, 10, 10);
		
		c.set(Calendar.YEAR, 2015);
		c.set(Calendar.MONTH, 12);
		c.set(Calendar.DATE, 19);
		c.setTime(new Date());
		
		
		c.add(Calendar.YEAR, 30);
		
		System.out.println(c.getTime().getTime());
		
	}

}