package com.example.testmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_ {

	public static void main(String[] args) {

		String str = "this is a number of this numbers";
		String[] strs = str.split(" ");
		for (String s : strs) {
			System.out.print(s + ",");
		}
		Map<String, Letter> letters = new HashMap<String, Letter>();

		for (String temp : strs) {
			System.out.println(temp);
			Letter col = null;
			if (null == (col = letters.get(temp))) {
				col = new Letter();
				col.setCount(1);
				letters.put(temp, col);
			} else {
				col.setCount(col.getCount() + 1);
			}
		}
		
		Set<String> set = letters.keySet();
		for(String s : set){
			
			System.out.println("×ÖÄ¸£º" + s + " ´ÎÊı " + letters.get(s).getCount());
		}
	}

}
