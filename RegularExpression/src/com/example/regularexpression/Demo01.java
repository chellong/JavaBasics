package com.example.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �����������ʽ����Ļ����÷�
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//������ַ�����asfsdf23323���Ƿ����ָ�����������ʽ��\w+
		//����ʽ����
		Pattern p = Pattern.compile("\\w+");
		//����Matcher����
		Matcher m = p.matcher("asfsdf2&&3323");
//		boolean yesorno = m.matches();	//���Խ������ַ��������ģʽƥ��
//		System.out.println(yesorno);
		
//		boolean yesorno2 = m.find();	//�÷���ɨ����������У��������ģʽƥ�����һ��������
//		System.out.println(yesorno2);
		
//		System.out.println(m.find());
//		System.out.println(m.group());
//		System.out.println(m.find());
//		System.out.println(m.group());
		
	
		while(m.find()){
			System.out.println(m.group());	//group(),group(0)ƥ����������ʽ�����ַ���
			System.out.println(m.group(0));
		}
		
	}
}