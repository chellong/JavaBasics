package com.example.testreference;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/**
 * 弱引用
 * @author 北飞的候鸟
 *
 */
public class TestWeakHashMap {
	
	public static void main(String[] args) {
		
		WeakHashMap<String,String> map = new WeakHashMap<String,String>();
		for (int i = 0; i < 10; i++) {
			if(i < 5)
				map.put("1","1");
			else
				map.put(new String(i + ""), i + "");
		}
		printfMap(map);
		System.gc();
		System.runFinalization();
		System.out.println("***********************");
		printfMap(map);

	}
	
	public static void printfMap(Map<String,String> map){

		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println("< " + str + " , " + map.get(str) + " >");
		}
	}

}
