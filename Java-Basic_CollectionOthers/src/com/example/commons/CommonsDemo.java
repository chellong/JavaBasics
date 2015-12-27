package com.example.commons;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.EqualPredicate;

/**
 * 1、函数是编程 断言
 * 2、封装条件或判别式
 * 
 * new EqualPredicate<String>("123");
 * 
 * 
 * @author 北飞的候鸟
 *
 */
public class CommonsDemo {

	public static void main(String[] args) {
		System.out.println("*******判断相等********");
		Predicate<String> pre = new EqualPredicate<String>("123");
		System.out.println(pre.evaluate("12"));
	}
}
