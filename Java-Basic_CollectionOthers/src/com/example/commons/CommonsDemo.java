package com.example.commons;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.EqualPredicate;

/**
 * 1�������Ǳ�� ����
 * 2����װ�������б�ʽ
 * 
 * new EqualPredicate<String>("123");
 * 
 * 
 * @author ���ɵĺ���
 *
 */
public class CommonsDemo {

	public static void main(String[] args) {
		System.out.println("*******�ж����********");
		Predicate<String> pre = new EqualPredicate<String>("123");
		System.out.println(pre.evaluate("12"));
	}
}
