package com.example.syuread;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 1���յ��������������ⲿ�����ָ���쳣
 * 
 * @author ���ɵĺ���
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
