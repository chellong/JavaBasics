package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		for(int i = 0; i < 10; i++){
			map.put(i+ "", i + "");
		}
		
		Set<String> keySet = map.keySet();
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			String key =it.next();
			System.out.println("key = " + key + " value = " + map.get(key)); 
		}
	}
}
