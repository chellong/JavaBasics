package com.example.testDynamic;


public class TestDemo07 {
	
	public static void main(String[] args) {
	
		System.out.println(ClassLoader.getSystemClassLoader());
		System.out.println(ClassLoader.getSystemClassLoader().getParent());
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());   //JAVA_HOME/jre/lib/rt.jar
		System.out.println(System.getProperty("java.class.path"));
		
		System.out.println("################");
		String a = "gogogoo";
		System.out.println(a.getClass().getClassLoader());
		System.out.println(a);
	}
}
