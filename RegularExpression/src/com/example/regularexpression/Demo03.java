package com.example.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ����������ʽ������滻����
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		//���ʽ����
		Pattern p = Pattern.compile("[0-9]");
		//����Matcher����
		Matcher m = p.matcher("aa232**ssd445*sds223");
		//�滻
		String newStr = m.replaceAll("#");
		System.out.println(newStr);
		
		
	}
}
