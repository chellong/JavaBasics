package com.example.regularexpression;

import java.util.Arrays;

/**
 * �����������ʽ����ķָ��ַ����Ĳ���
 * @author Administrator
 *
 */
public class Demo04 {
	
	public static void main(String[] args) {
		String str = "a232b4334c3434";
		String[] arrs = str.split("\\d+");
		System.out.println(Arrays.toString(arrs));
		
	}
}