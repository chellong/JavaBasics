package com.example.testjavassist;

import java.lang.reflect.Modifier;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;

public class TestJavassistDemo02 {

	/**
	 * 
	 * 处理类的基本方法
	 * @throws Exception 
	 * 
	 */
	public static void test01() throws Exception{
		
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.example.testjavassist.Entity");
		
		byte[] bytes = cc.toBytecode();
		System.out.println(bytes);
		System.out.println(cc.getName());
		System.out.println(cc.getSimpleName());
		System.out.println(cc.getSuperclass());
		System.out.println(cc.getInterfaces());
		
	}
	
	public static void test02() throws Exception{
	
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.example.testjavassist.Entity");
		
		CtMethod m = new CtMethod(CtClass.intType,"add",
				new  CtClass[]{CtClass.intType,CtClass.intType}, cc);
		m.setModifiers(Modifier.PUBLIC);
		//$0 == this
		m.setBody("{System.out.println(\"www.baidu.com\");return $1 + $2;}");
		cc.addMethod(m);
		
		//通过反射加载新生成的方法
		Class<?> clz = cc.toClass();
		Object obj = clz.newInstance();
		java.lang.reflect.Method method = clz.getDeclaredMethod("add", int.class,int.class);
		Object result = method.invoke(obj, 200,300);
		System.out.println(result);
	}
	
	public static void test03() throws Exception{
		
		ClassPool pool = ClassPool.getDefault();
		CtClass cc = pool.get("com.example.testjavassist.Entity");
		
		CtConstructor[] constructor = cc.getConstructors();
		
		System.out.println(constructor);
		CtMethod cm = cc.getDeclaredMethod("sayHello",new CtClass[]{CtClass.intType});
		cm.insertBefore("System.out.println($1);"
				+ "System.out.println(\"hello world\");");
		cm.insertAt(10, "System.out.println(\"11\");");
		Class<?> clz = cc.toClass();
		Object obj = clz.newInstance();
		java.lang.reflect.Method method = clz.getDeclaredMethod("sayHello", int.class);
		method.invoke(obj, 200);
		
	}
	
	
	public static void main(String[] args) throws Exception {
		
		//test01();
		//test02();
		test03();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
