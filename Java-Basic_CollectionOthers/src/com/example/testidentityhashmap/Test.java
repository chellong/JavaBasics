package com.example.testidentityhashmap;

import java.util.IdentityHashMap;


/**
 * IdentityHashMap ���Ƚϵ�ַȥ��
 * 
 * @author ���ɵĺ���
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		IdentityHashMap<String, String> map = new IdentityHashMap<>();
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
		
		
	}

}
