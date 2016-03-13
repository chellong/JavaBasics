package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static String str = "1+1=";
	private static int strNum;
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < str.length(); i++){
			list.add(str.substring(i, i+1));
		}
		
		for(int i = 0; i < list.size(); i++ ){
		
			try{
				strNum = strNum + Integer.parseInt(list.get(i));
				
			}catch(Exception e){
				break;
			}
		}
		System.out.println(strNum);
	}

}
