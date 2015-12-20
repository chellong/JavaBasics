package com.example.testfile;

import java.io.File;
import java.io.IOException;

/**
 * 1、文件和目录
 * 
 * @author 北飞的候鸟
 *
 */
public class TestFile {

	public static void main(String[] args) {
		
		File file = new File("C:/hsrv.txt");
		if(file.isFile()){
			System.out.println("文件");
		}
		if(file.isDirectory()){
			System.out.println("是一个文件夹");
		}else{
			System.out.println("不是一个文件夹");
		}
		
		System.out.println(file.getName());
		System.out.println(file.length());
		
		File f = new File("D:/666.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File f1 = new File("D:/666");
		f1.mkdir();
		//f1.mkdirs();
	}
}
