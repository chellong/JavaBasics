package com.example.testio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo04 {

	public static void main(String[] args) {
File file = new File("D:/1.txt");
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			char[] chr = new char[1024];
			while(-1 != (reader.read(chr))){
				String str = new String(chr);
				System.out.println(str);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
