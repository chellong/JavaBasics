package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestIterator {

	public static void main(String[] args) {

		Set<Integer> list = new HashSet<>();
		for(int i = 0; i < 10; i++){
			list.add(i);
		}
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println(i);
		}
		
		for(Integer i : list){
			System.out.println(i + "for-each");
		}
		
		for(Iterator<Integer> its = list.iterator();its.hasNext();){
			Integer inte = its.next();
			System.out.println(inte.intValue() + "for");
		}
	}

}
