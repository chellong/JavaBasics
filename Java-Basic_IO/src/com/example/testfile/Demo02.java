package com.example.testfile;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 1��mkdirc����Ŀ¼��ȷ����Ŀ¼����
 * 2��mkdis ����Ŀ¼�������Ŀ¼�����ڣ��򴴽�
 * 3��list���� �ļ�Ŀ¼
 * 4��listFile�����ļ���ʽ��Ŀ¼
 * @author ���ɵĺ���
 *
 */

public class Demo02 {

	public static void main(String[] args) {
		
		File file = new File("D:\\and_tools\\android-sdk-windows");
		String[] files = file.list();
		for(String s : files){
			System.out.println(s);
		}
		
		System.out.println("*******************************************");
		File[] subFile = file.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".txt") && dir.isFile();
			}
		});
		for(File f : subFile){
			System.out.println(f.getName());
		}
	}
}