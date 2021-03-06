package com.example.guava;

import java.util.Set;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class GuavaDemo05 {
	
	public static void main(String[] args) {
		Set<Integer> set1 = Sets.newHashSet(1,2,3,4,5);
		Set<Integer> set2 = Sets.newHashSet(4,5,6,7,8);
		
		System.out.println("交集");
		SetView<Integer> inter = Sets.intersection(set1, set2);
		for(Integer i : inter){
			System.out.println(i);
		}
		
		System.out.println("差集");
		SetView<Integer> difs = Sets.difference(set1, set2);
		for(Integer i : difs){
			System.out.println(i);
		}
		
		System.out.println("并集");
		SetView<Integer> uning = Sets.union(set1, set2);
		for(Integer i : uning){
			System.out.println(i);
		}
	}

}
