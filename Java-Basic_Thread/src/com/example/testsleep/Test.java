package com.example.testsleep;

/**
 * ��ͣ��ǰ�߳�
 *   ���谭�̵߳���
 * @author ���ɵĺ���
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
