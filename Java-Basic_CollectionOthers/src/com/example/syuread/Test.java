package com.example.syuread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {


	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		
		List<String> lis = Collections.synchronizedList(list);
		
		for(int i = 0;i < lis.size(); i++){
			System.out.println(lis.get(i));
		}
			
	}
}
