package com.example.test_producer_consumer;

public class Player implements Runnable{

	private Movie m;

	public Player(Movie m) {
		this.m = m;
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 20; i++){
			
			if(i%2 == 0){
				m.play("1");
			}else{
				m.play("2");
			}
		}
		
	}
	
	public static void main(String[] args) {
 
	}

}
