package com.example.testfile;

import java.io.File;
import java.io.IOException;

/**
 * 1���ļ���Ŀ¼
 * 
 * @author ���ɵĺ���
 *
 */
public class TestFile {

	public static void main(String[] args) {
		
		File file = new File("C:/hsrv.txt");
		if(file.isFile()){
			System.out.println("�ļ�");
		}
		if(file.isDirectory()){
			System.out.println("��һ���ļ���");
		}else{
			System.out.println("����һ���ļ���");
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
