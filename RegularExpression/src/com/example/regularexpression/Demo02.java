package com.example.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ�����з���Ĵ���
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		//������ַ�����asfsdf23323���Ƿ����ָ����������ʽ��\w+
		//���ʽ����
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		//����Matcher����
		Matcher m = p.matcher("aa232**ssd445*sds223");
	
		while(m.find()){
			System.out.println(m.group());	//group(),group(0)ƥ���������ʽ�����ַ���
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
		
	}
}
