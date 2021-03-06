package com.example.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
	
	public static void main(String[] args) {
		
		Queue<Requset> que = new ArrayDeque<Requset>();
		
		for(int i = 0; i < 10; i++ ){
			final int num = i; 
			que.offer(new Requset() {
				
				@Override
				public void deposit() {
					System.out.println("�ڣ�" + num +"��"+ Math.random() * 10000);
				}
			}); 
		}
		
		dealWith(que);
	}
	
	public static void dealWith(Queue<Requset> que){
		Requset req = null;
		while((req = que.poll()) != null){
			req.deposit();
		}
	}

}

interface Requset{
	
	void deposit();
	
}
