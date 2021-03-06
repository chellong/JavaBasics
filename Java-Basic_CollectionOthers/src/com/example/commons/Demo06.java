package com.example.commons;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import org.apache.commons.collections4.bidimap.DualTreeBidiMap;

/**
 * 1、双向map
 * 有序
 * 无序
 * @author 北飞的候鸟
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		//treeMap();
		hashMap();
	}
	
	public static void treeMap(){
		BidiMap<String, String> map = new DualTreeBidiMap<>();
		map.put("1", "4");
		map.put("2", "5");
		map.put("3", "6");
		
		//反转
		System.out.println(map.inverseBidiMap().get("1"));
		System.out.println(map.inverseBidiMap().get("4"));
		MapIterator<String, String> it = map.inverseBidiMap().mapIterator();
		while(it.hasNext()){
			String key = it.next();
			String value = it.getValue();
			System.out.println(key +" ----> "+ value);
		}
		
	}
	
	public static void hashMap(){
		BidiMap<String, String> map = new DualHashBidiMap<>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		//反转
		System.out.println(map.inverseBidiMap().get("1"));
		MapIterator<String, String> it = map.inverseBidiMap().mapIterator();
		while(it.hasNext()){
			String key = it.next();
			String value = it.getValue();
			System.out.println(key +" ----> "+ value);
		}
		
	}
}
