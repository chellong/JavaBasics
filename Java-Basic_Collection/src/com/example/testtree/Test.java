package com.example.testtree;

import java.util.TreeSet;

/**
 * 1��treeset����Ԫ�ؿ��������Ҳ����ظ�
 * 		�Աȣ�
 * 			set��ڣ�hashset��Ԫ�ر�����дhashCode��equals����
 * 			 ȥ�أ��Ƚϵ���0���ظ�
 * 1��Ԫ�ؿ����ظ� java.lang.Comparable +��comparTo new TreeSet����
 * 
 * 2������ҵ���� comparator + compare
 * 
 * 2�����������ݵ�ʱ�����򣬸��Ĳ�����������
 * 
 *   ��ò�Ҫ�޸�����
 * 
 * @author ���ɵĺ���
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