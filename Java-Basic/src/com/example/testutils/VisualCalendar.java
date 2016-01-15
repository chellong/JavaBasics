package com.example.testutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 1、根据输入显示可视化的日历 2、"\t" 制表符 3、"\n" 换行符
 * 
 * @author 北飞的候鸟
 *
 */
public class VisualCalendar {

	public static void main(String[] args) {

		System.out.println("输入时间按照格式****-**-**");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();

		DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = dft.parse(str);
			System.out.println(date);

			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(Calendar.DATE);
			calendar.set(Calendar.DATE, 1);
			int maxDay = calendar.getActualMaximum(Calendar.DATE);
			System.out.println("日\t一\t二\t三\t四\t五\t六\t");

			for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK) - 2; i++) {
				System.out.print("\t");
			}
			for (int i = 1; i <= maxDay; i++) {
				if (i == day)
					System.out.print("*");
				System.out.print(i + "\t");

				int week = calendar.get(Calendar.DAY_OF_WEEK);
				if (week == Calendar.SATURDAY) {
					System.out.println();
				}
				calendar.add(Calendar.DATE, 1);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
