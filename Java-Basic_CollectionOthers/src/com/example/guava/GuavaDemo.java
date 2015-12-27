package com.example.guava;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class GuavaDemo {

	public static void main(String[] args) {
		
		/**
		 * ֻ��
		 */
		List<String> list= new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		/**
		 * 
		 * ������ȫ
		 */
		//List<String> ls = Collections.unmodifiableList(list);
		
		List<String> ls = ImmutableList.of("1","2","3");
		for(String s : ls){
			System.out.println(s);
		}
		
				
		
	}
}
