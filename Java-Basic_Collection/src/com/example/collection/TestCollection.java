package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * arrayList �ײ������飬��ѯ�죬�޸ģ����룬ɾ����
 * 
 * LinkedList �ײ���������ѯ�����޸ģ����룬ɾ����
 * 
 * Vector �̰߳�ȫ��Ч�ʵ�
 * 
 * map �Iֵ�����}
 * 
 * @author ���ɵĺ���
 *
 */
public class TestCollection {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("��");
		list.add("��");
		
		for(String s : list){
			System.out.println(s);
		}
	}
}