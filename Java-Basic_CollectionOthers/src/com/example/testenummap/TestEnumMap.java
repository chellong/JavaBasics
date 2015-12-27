package com.example.testenummap;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

/**
 * EnumMap 要求键位枚举
 * 
 * @author 北飞的候鸟
 *
 */
public class TestEnumMap {

	public static void main(String[] args) {
		
		EnumMap<Season, String> map = new EnumMap<Season, String>(Season.class);
		
		map.put(Season.SPRING, 1 + "");
		map.put(Season.SUMMER, 2 + "");
		map.put(Season.AUTUMN, 3 + "");
		map.put(Season.WINTER, 4 + "");
		
		System.out.println(map.size());
		Set<Season> set = map.keySet();
		Iterator<Season> it = set.iterator();
		while(it.hasNext()){
			Season str = it.next();
			System.out.println("< " + str + " , " + map.get(str) + " >");
		}
	}
}

enum Season{
	SPRING,SUMMER,AUTUMN,WINTER;
}