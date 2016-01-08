package com.example.testinteger;

import java.lang.reflect.Field;

/**
 * Integer.java类中的内部私有类IntegerCache.java，为-128到127之间的所有整数对象提供了
 * 缓存。为数值较小的整数提供内部缓存，当有如下声明
 * Integer a = 100;
 * 它的内部为
 * Integer i = Integer.valueOf(100);
 * valueOf函数：
 * public static Integer valueOf(int i) {
 *      if (i >= IntegerCache.low && i <= IntegerCache.high)
 *          return IntegerCache.cache[i + (-IntegerCache.low)];
 *      return new Integer(i);
 *  }
 *  the reason why(baidu translate) 
 * @author 北飞的候鸟
 *
 */
public class TestInteger {

	private static void integerProblem(){
		
		Integer a = 1000;
		Integer b = 1000;
		System.out.println( "Integer a and b = -128 judgment a equals b ? " + (a == b) );	
		
		Integer c = -128;
		Integer d = -128;
		System.out.println( "Integer c and d = -128 judgment c equals d ? " + (c == d) );
		
		Integer e = 127;
		Integer f = 127;
		System.out.println( "Integer e and f = -128 judgment e equals f ? " + (e == f) );

	}
	
	/**
	 * @author 北飞的候鸟
	 * 
	 * 用反射將緩存中的数字改了
	 * 
	 */
	@SuppressWarnings("rawtypes")
	private static void integerCode(){
		
		Class cache = Integer.class.getDeclaredClasses()[0];
		try {
			Field myCache = cache.getDeclaredField("cache");
			myCache.setAccessible(true);
			
			Integer[] newCache = (Integer[]) myCache.get(cache);
			newCache[132] = newCache[133];
			
			int a = 2;
			int b = a + a ;
			System.out.println("更改缓存中的数据后");
			System.out.printf("%d + %d = %d" , a,a,b);
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		TestInteger.integerProblem();
		TestInteger.integerCode();
	}

}