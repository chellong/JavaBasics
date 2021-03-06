package com.example.generic_;

/**
 * 1、父类位泛型类
 * 	1.1、属性
 *  1.2、方法
 *  
 *  
 *  
 * 2、要么同时擦除，要么不大于父类的类型
 * 
 * 3、属性类型
 * 		3.1、父类中随父类而定
 * 		3.2、子类中子类而定
 * 
 * 4、方法重写
 * 		随父类而定
 * 
 * @author 北飞的候鸟
 *
 * @param <T>
 */
public abstract class Father<T> {
	
	T name;
	public abstract void test(T t);
}

/**
 * 1、子类申明的时候制定具体的类型
 * 2、属性类型为具体类型
 * 3、方法同理
 * 
 * @author 北飞的候鸟
 *
 */

class Child extends Father<String>{

	String t2;
	
	@Override
	public void test(String t) {
		
	}
	
}

/**
 * 1、子类位泛型类
 * 
 * @author 北飞的候鸟
 *
 */

class Child_<T> extends Father<T>{

	T t2;

	@Override
	public void test(T t) {
		
	}
	
}

/**
 * 1、子类为泛型类，父类不指定泛型
 * 2、泛型的擦数，使用Object替换
 * 
 * @author 北飞的候鸟
 *
 * @param <T>
 */
@SuppressWarnings("rawtypes")
class Child_2<T> extends Father{

	T name;
	
	@Override
	public void test(Object t) {
		
	}

	
}

/**
 * 子类和父类同时替换
 * 
 * @author 北飞的候鸟
 *
 */
@SuppressWarnings("rawtypes")
class Child_3 extends Father{

	@Override
	public void test(Object t) {
		
	}
}

/**
 * 错误：子类擦数。父类使用泛型
 * 
 * 	class Child_2 extends Father<T>{
 * 
 *		@Override
 *		public void test(Object t) {
 *
 *		
 *		}
 *		}
 */

