package com.example.testgeneric;

public class test {

	public static void main(String[] args) {
		
		Student stu = new Student(80,90);
		int i = (int)stu.getJavase();
		int o = (int)stu.getOracle();
		
		System.out.println(i + o);
	}
}
