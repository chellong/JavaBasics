package com.example.guava;

import java.util.Set;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class GuavaDemo06 {

	public static void main(String[] args) {
		String str = "there have a good man his is very a handsome man";
		String[] strs = str.split(" ");
		
		Multiset<String> set = HashMultiset.create();
		for(String s : strs){
			set.add(s);
		}
		
		Set<String> letters = set.elementSet();
		for(String s : letters){
			System.out.println(s + "---->" + set.count(s));
		}
		
	}
}
