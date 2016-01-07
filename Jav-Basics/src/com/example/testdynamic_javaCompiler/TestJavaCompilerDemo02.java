package com.example.testdynamic_javaCompiler;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * classLoader
 * @author 北飞的候鸟
 *
 */
@SuppressWarnings("all")
public class TestJavaCompilerDemo02 {
	
	public static void main(String[] args) {
		
		try{
			
			URL[] urls = new URL[]{new URL("file:/" + "E:/JavaBasics/Jav-Basics/")};
			URLClassLoader loader = new URLClassLoader(urls);
			Class c = loader.loadClass("HelloWorld");
			
			
			//调用加载类的main方法
			Method m = c.getMethod("main", String[].class);
					m.invoke(null, (Object)new String[]{});
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
