package com.example.teststring;

/**
 * String (不可变) StringBuluder(线程不安全，效率高) StringBuffer (线程安全，效率低)
 * 
 * @author 北飞的候鸟
 *
 */
public class TsetStringBulider {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		long flag = 0;
		for (int i = 0; i < 100000; i++) {
			sb = sb.append(i);
			if(flag != sb.hashCode()){
				System.out.println(sb.hashCode());
			}
			flag = sb.hashCode();
		}
		System.out.println(sb);
	}
}
