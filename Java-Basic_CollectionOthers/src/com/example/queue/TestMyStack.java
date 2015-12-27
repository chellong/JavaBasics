package com.example.queue;

public class TestMyStack {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<>(10);
		for(int i = 0; i < 10; i++){
			stack.puth(i+"");
		}
		String item = null;
		while(null != (item = stack.pop())){
			System.out.println(item);
		}
	}
}
