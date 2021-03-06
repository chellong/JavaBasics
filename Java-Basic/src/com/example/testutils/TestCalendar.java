package com.example.testutils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * 日期类 日期计算
 * 
 * 月份从0开始计算
 * 
 * 一月 二月 三月 四月 ...
 * 0      1   2    3   ...
 * 
 * 周
 *  
 *  星期日 星期一 星期二 星期三 星期四 星期五 星期六
 *  1		2		3		4		5
 * 
 * @author 北飞的候鸟
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
