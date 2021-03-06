package com.example.test_producer_consumer;

/**
 * 1、生产者消费者
 * Producer consumer
 * 
 * @author 北飞的候鸟
 *
 */
public class Movie {

	private String pic;
	
	private boolean flag = true;
	
	public synchronized void play(String str){
		if( !flag ){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.pic = str;
		
		this.notify();
		
		this.flag = false;
	}
	
	public synchronized void watch(){
		if( flag ){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(this.pic);
		
		this.notifyAll();
		
		flag = true;
	}
	
	public static void main(String[] args) {
		
	}
}
