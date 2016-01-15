package com.example.testClassLoader;

/**
 * 测试自定义的FileSystemClassLoader
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
		System.out.println(c3.hashCode());	//同一个类，被不同的加载器加载，JVM认为也是不相同的类
		System.out.println(c4.hashCode());
		System.out.println(c4.getClassLoader());	//引导类加载器
		System.out.println(c3.getClassLoader());	//自定义的类加载器
		System.out.println(c5.getClassLoader());	//系统默认的类加载器
		
	}
}
