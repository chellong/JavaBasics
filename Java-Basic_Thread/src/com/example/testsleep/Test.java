package com.example.testsleep;

/**
 * 暂停当前线程
 *   会阻碍线程调度
 * @author 北飞的候鸟
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main");
	}

}
