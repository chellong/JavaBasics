package com.example.testfile;

import java.io.File;
import java.util.Arrays;

public class Demo03 {

	public static void main(String[] args) {
		
		File[] root = File.listRoots(); 
		System.out.println(Arrays.toString(root));
		File file = new File("D:\\and_tools\\android-sdk-windows");
		System.out.println("start");
		listFile(file);
		
	}
	
	public static void listFile(File path){
		if(path == null || !path.exists()){
			return;
		}
		System.out.println(path.getName());
		if(path.isDirectory()){
			for(File sub : path.listFiles()){
				listFile(sub);
			}
		}
	}
}
