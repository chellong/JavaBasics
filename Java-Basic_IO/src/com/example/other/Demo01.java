package com.example.other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo01 {
	
	public static void main(String[] args) {
		
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
