package com.example.testutils;

import java.util.Date;

/**
 * �ڼ������ʱ��Ҳ������
 * 
 * ��׼��Ԫ1970.1.1ؼ0�㿪ʼ��ĳ��ʱ�̵ĺ�����
 * 
 * ������long
 * 
 * ������long���Ա�ʾԼ1����+��ʱ��
 * 
 * @author ���ɵĺ���
 *
 */
public class TestDate {
	
	public static void main(String[] args) {
		
		long star = System.currentTimeMillis();
		Date time = new Date(star);
		
		System.out.println(time.getTime() == star);
	}
}