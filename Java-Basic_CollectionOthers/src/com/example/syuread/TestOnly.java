package com.example.syuread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 1、空的容器，可以让外部避免空指针异常
 * 
 * @author 北飞的候鸟
 *
 */
public class TestOnly {
	
	public static void main(String[] args) {
	
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		
		Map<String,String> m = Collections.unmodifiableMap(map);
		
		Set<String> set = m.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}

}
