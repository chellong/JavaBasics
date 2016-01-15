package com.example.testwrapperclass;

/**
 * 基本类型的包装类
 * 
 * 自动装箱
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
		Integer i = new Integer(1000);
		Double d = new Double(10.00);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(i.intValue());
		System.out.println(i.doubleValue());
		System.out.println(d.intValue());
		System.out.println(Integer.toHexString(i));
		
		Integer in = 20;
		System.out.println(in.doubleValue());
	}

}
