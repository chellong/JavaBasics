package com.example.test_jvm;

/**
 * 
 * 1����ȡclass�ļ�
 * 2������
 * 3����ʼ��
 * 
 * @author ���ɵĺ���
 *
 */

@SuppressWarnings("all")
public class TestJvmDemo01 {
	
	static {
		System.out.println("��̬��ʼ��TestJvmDemo01");
	}
	
	
	public static void main(String[] args) {
//		System.out.println("TestJvmDemo01");
//		��������
//		new B();
//		System.out.println(A.width);
//		new B();
//		try {
//			Class.forName("com.example.test_jvm.A");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		//��������
		//System.out.println(A.MAX);
		System.out.println(B.width);
		
		
	}

}

class A extends Object{
	public static int width = 100;
	public static final int MAX = 100;
	
	static {
		System.out.println("��̬��ʼ��A");
		width = 1000;
	}
	public A(){
		System.out.println("A");
	}
}

class B extends A{
	
	static {
		System.out.println("��̬��ʼ��B");
		width = 300;
	}
	
	public B(){
		System.out.println("B");
	}
	
}