package com.example.testenumeration;

import java.util.StringTokenizer;

public class TestStringTokenizer {

	public static void main(String[] args) {
		
		String email = "352977335@qq.com";
		StringTokenizer st = new StringTokenizer(email, "@");
		while(st.hasMoreElements()){
			System.out.println(st.nextToken());
		}
	}
}
