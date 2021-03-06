package com.example.testsingle;

/**
 * 单利的创建方式
 * 1、懒汉式
 * 		构造器私有化
 * 		申明私有的静态属性
 * 		对外提供访问属性的静态方法，确保该对象存在
 * 
 * 
 * 2、恶汉式
 * 
 * 		构造器私有化
 * 		申明私有的静态属性，同时创建
 * 		对外提供访问属性的静态方法，确保该对象存在
 * 
 * 
 * 3、该进版的恶汉式
 * 
 * 		提供创建类的私有类，类在夹在的时候创建
 * 
 * @author 北飞的候鸟
 *
 */
public class TestSingles {


	private static TestSingles instance = null;
	
	private TestSingles(){
		
	}
	
	public static TestSingles getInstance(){
		if(instance == null){
			instance = new TestSingles();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("single dog ");
	}
	
	public static void main(String[] args) {
		
	}
	
}

class TestSingles_1{
	
private static TestSingles_1 instance = new TestSingles_1();
	
	private TestSingles_1(){
		
	}
	
	public static TestSingles_1 getInstance(){
		return instance;
	}
	
	public void print(){
		System.out.println("single dog ");
	}
	
	public static void main(String[] args) {
		
	}
	
}

/**
 * 该进版的单利模式
 * 类在使用的时候加载
 * 延迟加载
 * 
 * @author 北飞的候鸟
 *
 */

class TestSingles_2{
	
	private static class TestSingles_2_Hodle{
		private static TestSingles_2 instance = new TestSingles_2();
	}
	
	private TestSingles_2() {

	}
	
	public static TestSingles_2 getInstance() {
		return TestSingles_2_Hodle.instance;
	}
	
	public void print(){
		System.out.println("single dog ");
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
