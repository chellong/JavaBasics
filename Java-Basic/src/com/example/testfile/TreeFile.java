package com.example.testfile;

import java.io.File;

public class TreeFile {

	public static void getTreeFile(File file,int level){
		for(int i = 0; i < level;i++){
			System.out.print("-");
		}
		System.out.println(file.getName());
		if(file.isDirectory() && file.isAbsolute()){
			File[] files = file.listFiles();
			for(File temp : files){
				getTreeFile(temp, level + 1);
			}
		}else{
			return;
		}
	}
	
	public static void main(String[] args) {
		File file = new File("D:\\and_tools");
		TreeFile.getTreeFile(file, 0);
	}
}
