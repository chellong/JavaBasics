package com.example.testexception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {

		FileReader reader = null;
		try {
			reader = new FileReader("d:/a.txt");
			char temp = (char) reader.read();
			System.out.println(" " + temp);
		} catch (FileNotFoundException e) {
			System.out.println("文件没有找到");
		} catch (IOException e) {
			System.out.println("IO异常");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
