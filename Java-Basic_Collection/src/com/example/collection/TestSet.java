package com.example.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}
}
