package com.example.testfile;

import java.io.File;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) {
		File file = new File("/txt/2.txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.canWrite());
		System.out.println(file.canRead());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		System.out.println(file.delete());
		
	}
}
