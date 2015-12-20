package com.example.testexception;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyException() {

	}
	
	public MyException(String message){
		super(message);
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		try {
			throw new MyException("MyException");
		} catch (MyException e) {
			e.printStackTrace();
			System.out.println("�l������");
		}
	}

}

