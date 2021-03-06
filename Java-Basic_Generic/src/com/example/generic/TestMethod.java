package com.example.generic;

import java.io.Closeable;
import java.io.IOException;

/**
 * 
 * 0、泛型方法《》 返回类型签名
 * 
 * 1、泛型方法只能访问对象的信息，不能修该信息
 * 
 * @author 北飞的候鸟
 *
 */
public class TestMethod {

	public static <T> void test(T a){
		System.out.println(a);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Closeable> void test(T...a){
		
		for(T temp : a){
			try {
				if(temp != null){
					temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		test(123);
	}

}
