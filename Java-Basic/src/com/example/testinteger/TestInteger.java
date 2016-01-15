package com.example.testinteger;

import java.lang.reflect.Field;

/**
 * Integer.java���е��ڲ�˽����IntegerCache.java��Ϊ-128��127֮����������������ṩ��
 * ���档Ϊ��ֵ��С�������ṩ�ڲ����棬������������
 * Integer a = 100;
 * �����ڲ�Ϊ
 * Integer i = Integer.valueOf(100);
 * valueOf������
 * public static Integer valueOf(int i) {
 *      if (i >= IntegerCache.low && i <= IntegerCache.high)
 *          return IntegerCache.cache[i + (-IntegerCache.low)];
 *      return new Integer(i);
 *  }
 *  the reason why(baidu translate) 
 * @author ���ɵĺ���
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
	 * @author ���ɵĺ���
	 * 
	 * �÷��䌢�����е����ָ���
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
			System.out.println("���Ļ����е����ݺ�");
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