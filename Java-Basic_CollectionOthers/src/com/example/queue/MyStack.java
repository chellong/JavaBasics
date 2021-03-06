package com.example.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack <T>{

	
	private Deque<T> container = new ArrayDeque<T>();
	private int cap;
	
	
	public MyStack(int cap) {
		
		this.cap = cap;
	}
	
	public boolean puth(T e){
		if(container.size() + 1 > cap){
			return false;
		}
		return container.offerLast(e);
		
	}
	
	public T pop(){
		return container.pollLast();
	}
	
	//��ȡ
	public T peek(){
		return container.peekLast();
	}
	
	public int getSize(){
		return this.cap;
	}
	
	
	
	
}
