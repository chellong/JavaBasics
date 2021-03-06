package com.example.testjoin;

public class TestJoin extends Thread{

	@Override
	public void run() {
		for(int i = 0; i < 100; i ++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("run" + i);
		}
	}
	
	/**
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		TestJoin target = new TestJoin();
		Thread t = new Thread(target);
		t.start();
		
		for(int i = 0; i < 100; i ++){
			Thread.sleep(1000);
			if(i == 50){
				t.join();
			}
			System.out.println("main ... " + i);
		}
		
	}
}
