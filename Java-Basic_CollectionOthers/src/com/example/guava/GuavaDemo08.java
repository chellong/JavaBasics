package com.example.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * map ����ֵ�����ظ�
 * 
 * @author ���ɵĺ���
 *
 */
public class GuavaDemo08 {

	public static void main(String[] args) {
		BiMap<String,String> map = HashBiMap.create();
		map.put("1", "1");
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		
		String str = map.inverse().get("1");
		System.out.println(str);
	}

}