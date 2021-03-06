package com.example.testtree;

import java.util.TreeSet;

/**
 * 1、treeset数据元素可以排序且不可重复
 * 		对比：
 * 			set借口：hashset，元素必须重写hashCode和equals方法
 * 			 去重：比较等于0即重复
 * 1》元素可以重复 java.lang.Comparable +　comparTo new TreeSet（）
 * 
 * 2》排序业务类 comparator + compare
 * 
 * 2、再添加数据的时候排序，更改不会重新排序
 * 
 *   最好不要修改数据
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("1",1);
		Person p2 = new Person("2",2);
		Person p3 = new Person("3",3);
		Person p4 = new Person("4",4);
		Person p5 = new Person("5",5);
		
		TreeSet<Person> treeSet = new TreeSet<Person>(
			new java.util.Comparator<Person>(){

				@Override
				public int compare(Person o1, Person o2) {
					return o1.getHandsome() - o2.getHandsome();
				}
				
			}
		);
		
		
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.add(p4);
		treeSet.add(p5);
	
		System.out.println(treeSet);
		
		p3.setHandsome(10);
		
		System.out.println(treeSet);
	}

}
