package com.example.testproperties;

import java.util.Properties;

/**
 * 1��.properties
 * 2���ַ���
 * 3��.xml 
 * 
 * ��Դ�����ļ��Ķ�д
 * 
 * 
 * key value Ϊ�ַ���
 * 
 * @author ���ɵĺ���
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Properties pro = new Properties();
		pro.setProperty("1","1");
		pro.setProperty("2","2");
		pro.setProperty("3","3");
		pro.setProperty("4","4");
		
		System.out.println(pro.getProperty("1", "1111111"));
		System.out.println(pro.getProperty("2", "1111111"));
		System.out.println(pro.getProperty("3", "1111111"));
		System.out.println(pro.getProperty("4", "1111111"));
		
		
		
	}
}
















