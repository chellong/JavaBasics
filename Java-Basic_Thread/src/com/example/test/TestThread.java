package com.example.test;

/**
 * 推荐使用runable
 * 方便使用资源
 * @author 北飞的候鸟
 *
 */
public class TestThread {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread t = new Thread(thread1);
		t.start();
		
	}
}

class Thread1 implements Runnable{

	@Override
	public void run() {
		int i = 0;
		while(true){
			System.out.println(i++);
		}
	}
	
}
