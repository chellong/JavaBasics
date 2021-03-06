package com.example.testreference;

import java.lang.ref.WeakReference;

/**
 * 引用分类：强，软，弱，虚 强与弱引用
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {

	public static void main(String[] args) {
		// tsetStringConstant();
		tsetStringReference();

	}
	public static void tsetStringReference() {
		String str = new String("123456789");
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("gc运行前：" + wr.get());
		str = null;
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后：" + wr.get());
	}

	public static void tsetStringConstant() {
		String str = "123456789";
		WeakReference<String> wr = new WeakReference<String>(str);
		System.out.println("gc运行前：" + wr.get());
		str = null;
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后：" + wr.get());
	}

}
