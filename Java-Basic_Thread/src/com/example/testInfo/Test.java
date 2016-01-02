
package com.example.testInfo;

public class Test extends Thread{
	
	@Override
	public void run() {

		while(true){
			System.out.println("...");
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Test test = new Test();
		test.setPriority(Thread.MAX_PRIORITY);
		System.out.println(test.getName());
		System.out.println(test.getPriority());
		System.out.println(test.getClass());
		System.out.println(test.getState());
		System.out.println(test.isAlive());
		
		test.start();
		test.stop();
	}

}
