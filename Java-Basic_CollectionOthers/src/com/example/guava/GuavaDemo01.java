package com.example.guava;

import java.util.Collection;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class GuavaDemo01 {

	public static void main(String[] args) {
		List<String> list = Lists.newArrayList("moon"
				,"son","dad","refer");
		//找出回文，正反一样
		Collection<String> ls = Collections2.filter(list,
				new Predicate<String>() {

					@Override
					public boolean apply(String input) {
						return new StringBuilder(input).reverse().toString().equals(input);
					}
				});
		
		for(String s : ls){
			System.out.println(s);
		}
	}
}
