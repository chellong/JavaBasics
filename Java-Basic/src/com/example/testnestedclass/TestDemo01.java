package com.example.testnestedclass;

@SuppressWarnings("all")
public class TestDemo01 {
	
	static class StaticNestedClass{
		
	}
	
	private class FieldInnerClass{
		
	}
	
	static void test(){
		class LocalClass{
			
		}
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		runnable.run();
		
		
	}
	
	public static void main(String[] args) {
		test();
		
	}

}
