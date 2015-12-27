package com.example.guava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * 分析教师缩教授的课程
 * 
 * @author 北飞的候鸟
 *
 */
public class GuavaDemo07 {
	
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("1", "2");
		map.put("2", "2");
		map.put("2", "2");
		map.put("3", "3");
		
		Multimap<String, String> m = ArrayListMultimap.create();
		
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, String> en = it.next();
			String key = en.getKey();
			String value = en.getValue();
			
			m.put(key, value);
		}
		Set<String> keySet = m.keySet(); 
		for(String key : keySet){
			Collection<String> col = m.get(key);
			System.out.println(key + "---->" + col);
		}
	}

}
