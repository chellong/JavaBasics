package com.example.testClassLoader;

/**
 * �����Զ����FileSystemClassLoader
 *
 */
public class TestDemo01 {
	public static void main(String[] args) throws Exception{
		FileSystemClassLoader loader = new FileSystemClassLoader("");
		FileSystemClassLoader loader2 = new FileSystemClassLoader("");
		
		Class<?> c = loader.loadClass("");
		Class<?> c2 = loader.loadClass("");
		Class<?> c3 = loader2.loadClass("");

		Class<?> c4 = loader2.loadClass("");
		Class<?> c5 = loader2.loadClass("");
		
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());	//ͬһ���࣬����ͬ�ļ��������أ�JVM��ΪҲ�ǲ���ͬ����
		System.out.println(c4.hashCode());
		System.out.println(c4.getClassLoader());	//�����������
		System.out.println(c3.getClassLoader());	//�Զ�����������
		System.out.println(c5.getClassLoader());	//ϵͳĬ�ϵ��������
		
	}
}
