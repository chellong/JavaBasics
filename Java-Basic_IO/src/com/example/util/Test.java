package com.example.util;

public class Test {
	

	public static void main(String[] args) {
		
		SplitFile file = new SplitFile("C:\\Users\\���ɵĺ���\\Desktop\\�½��ļ���\\test.txt", 50,"C:\\Users\\���ɵĺ���\\Desktop\\�½��ļ���");
		
		System.out.println(file.size);
		
		file.split("C:\\Users\\���ɵĺ���\\Desktop\\�½��ļ���");
		
		file.margeFile("C:\\Users\\���ɵĺ���\\Desktop\\�½��ļ���\\123.txt");
	}
}