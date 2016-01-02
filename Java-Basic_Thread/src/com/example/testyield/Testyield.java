package com.example.testyield;


public class Testyield extends Thread{

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
		
		Testyield target = new Testyield();
		Thread t = new Thread(target);
		t.start();
		
		for(int i = 0; i < 100; i ++){
			Thread.sleep(1000);
			if(i == 50){
				//ÔÝÍ£Ïß³Ì
				Thread.yield();
			}
			System.out.println("main ... " + i);
		}
		
	}
}
