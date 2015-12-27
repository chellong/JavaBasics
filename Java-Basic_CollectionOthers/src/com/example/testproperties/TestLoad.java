package com.example.testproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestLoad {

	public static void main(String[] args) {
		Properties pro = new Properties();
		try {
			pro.load(new FileReader("src/com/example/"
						+ "testproperties/pro.properties"));
			
			System.out.println(pro.get("1"));
			System.out.println(pro.get("2"));
			System.out.println(pro.get("3"));
			System.out.println(pro.get("4"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
