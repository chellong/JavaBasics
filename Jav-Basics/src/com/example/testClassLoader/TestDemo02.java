package com.example.testClassLoader;

/**
 * ���Լ򵥼��ܽ���(ȡ��)����
 *
 */

@SuppressWarnings("all")
public class TestDemo02 {
	public static void main(String[] args) throws Exception {
		System.out.println("����ȡ������");
		int a = 3; //0000011
		System.out.println(Integer.toBinaryString(a^0xff));
		System.out.println("************");
		
		//���ܺ��class�ļ�����������������޷����أ���classFormatError
		FileSystemClassLoader loader = new FileSystemClassLoader("Jav-Basics/HelloWorld.class");
		
		Class<?> c = loader.loadClass("HelloWorld");
		System.out.println(c);
		
		//DecrptClassLoader loader = new DecrptClassLoader("d:/myjava/temp");
		
		DecrptClassLoader loader1 = new DecrptClassLoader("/Jav-Basics/HelloWorld");
		Class<?> c1 = loader.loadClass("HelloWorld");
		System.out.println(c);
		
	}
}