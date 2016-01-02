package com.example.test;

public class Test12306 implements Runnable {
		

	private int num = 50;
	

	@Override
	public void run() {

		while (true) {
			if (num <= 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "  " + num--);
		}

	}


	public static void main(String[] args) {
		
		Test12306 t = new Test12306();
		Thread t1 = new Thread(t, "1");
		t1.start();
		
		Thread t2 = new Thread(t, "2");
		t2.start();
		
		Thread t3 = new Thread(t, "3");
		t3.start();
	}
	

}
