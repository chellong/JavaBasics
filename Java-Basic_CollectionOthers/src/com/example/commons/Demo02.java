package com.example.commons;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.list.PredicatedList;

public class Demo02 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		System.out.println("not null");
		Predicate<String> selfPre = new Predicate<String>() {
			
			@Override
			public boolean evaluate(String in) {
				return in.length() >= 5 && in.length() <=20;
			}
		};
		Predicate<String> notNull = NotNullPredicate.notNullPredicate();
		Predicate<String> all = PredicateUtils.allPredicate(notNull,selfPre);
		
		List<String> list = PredicatedList.predicatedList(new ArrayList<String>(),
				all);
		
		list.add("12345");
		
		for(String s : list){
			System.out.println(s);
		}
		
		
	}
}
