package com.example.testcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1、二分查找,现有序
 * 
 * 2、反序
 * 
 * 3、交换数据
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {

	public static void main(String[] args) {
		//testReverse();
		test();
		
	}
	
	public static void test(){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < 54; i++){
			list.add(i);
		}
		System.out.println(list);
		
		Collections.shuffle(list);
		
		List<Integer> p1 = new ArrayList<Integer>();
		List<Integer> p2 = new ArrayList<Integer>();
		List<Integer> p3 = new ArrayList<Integer>();
		List<Integer> last = new ArrayList<Integer>();
		
		for(int i = 0; i < 51; i += 3){
			p1.add(list.get(i));
			p2.add(list.get(i+1));
			p3.add(list.get(i+2));
		}
		
		last.add(list.get(50));	
		last.add(list.get(51));	
		last.add(list.get(52));	
		
		System.out.println("1" + p1);
		System.out.println("2" + p2);
		System.out.println("3" + p3);
		System.out.println("last" + last);
	}
	
	public static void testReverse(){
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i < 10; i++){
			list.add(i);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
