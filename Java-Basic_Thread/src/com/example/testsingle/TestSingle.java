package com.example.testsingle;

public class TestSingle {

	private static TestSingle instance = null;
	
	private TestSingle(){
		
	}
	
	public static TestSingle getInstance(){
		if(instance == null){
			instance = new TestSingle();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("single dog ");
	}
	
	
	
	public static void main(String[] args) {
		TestSingle testSingle = TestSingle.getInstance();
		testSingle.print();
	}
}
