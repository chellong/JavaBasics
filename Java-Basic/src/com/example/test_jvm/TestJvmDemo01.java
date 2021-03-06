package com.example.test_jvm;

/**
 * 
 * 1、读取class文件
 * 2、连接
 * 3、初始化
 * 
 * @author 北飞的候鸟
 *
 */

@SuppressWarnings("all")
public class TestJvmDemo01 {
	
	static {
		System.out.println("静态初始化TestJvmDemo01");
	}
	
	
	public static void main(String[] args) {
//		System.out.println("TestJvmDemo01");
//		主动引用
//		new B();
//		System.out.println(A.width);
//		new B();
//		try {
//			Class.forName("com.example.test_jvm.A");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		//被动引用
		//System.out.println(A.MAX);
		System.out.println(B.width);
		
		
	}

}

class A extends Object{
	public static int width = 100;
	public static final int MAX = 100;
	
	static {
		System.out.println("静态初始化A");
		width = 1000;
	}
	public A(){
		System.out.println("A");
	}
}

class B extends A{
	
	static {
		System.out.println("静态初始化B");
		width = 300;
	}
	
	public B(){
		System.out.println("B");
	}
	
}