package com.example.testtimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * �������
 * 
 * ��� quartz
 * 
 * @author ���ɵĺ���
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(1);
			}
		}, new Date(System.currentTimeMillis() + 10000),200);
		
	}
}
