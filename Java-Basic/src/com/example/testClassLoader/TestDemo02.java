package com.example.testClassLoader;

/**
 * 测试简单加密解密(取反)操作
 *
 */

@SuppressWarnings("all")
public class TestDemo02 {
	public static void main(String[] args) throws Exception {
		System.out.println("测试取反操作");
		int a = 3; //0000011
		System.out.println(Integer.toBinaryString(a^0xff));
		System.out.println("************");
		
		//加密后的class文件，正常的类加载器无法加载，报classFormatError
		FileSystemClassLoader loader = new FileSystemClassLoader("Jav-Basics/HelloWorld.class");
		
		Class<?> c = loader.loadClass("HelloWorld");
		System.out.println(c);
		
		//DecrptClassLoader loader = new DecrptClassLoader("d:/myjava/temp");
		
		DecrptClassLoader loader1 = new DecrptClassLoader("/Jav-Basics/HelloWorld");
		Class<?> c1 = loader.loadClass("HelloWorld");
		System.out.println(c);
		
	}
}
