package com.example.guava;

import java.util.Set;

import com.google.common.base.Preconditions;
import com.google.common.collect.Constraint;
import com.google.common.collect.Constraints;
import com.google.common.collect.Sets;

public class GuavaDemo04 {

	public static void main(String[] args) {
		Set<String> set = Sets.newHashSet();
		
		Constraint<String> constraint = new Constraint<String>(){

			@Override
			public String checkElement(String element) {
				Preconditions.checkNotNull(element);
				Preconditions.checkArgument(element.length() >= 5 && element.length() <= 20);
				return element;
			}
		};
		
		Set<String> cs = Constraints.constrainedSet(set, constraint);
		
		//cs.add(null);
		//cs.add("1");
		
		cs.add("123456");
		for(String s : cs){
			System.out.println(s);
		}
		
		
	}
}
