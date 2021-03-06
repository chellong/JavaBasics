package com.example.commons;

import java.util.Iterator;
import java.util.Set;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;

/**
 * bag 包允许重复
 * 
 * @author 北飞的候鸟
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		//hashBag();
		//treeBag();
		
		String str = "this is a goog boy a a" ;
		String[] arrStr = str.split(" "); 
		Bag<String> bag = new TreeBag<String>();
		for(String s : arrStr){
			bag.add(s);
		}
		
		Set<String> set = bag.uniqueSet();
		for(String s : set ){
			System.out.println(s + " ----> " + bag.getCount(s));
		}
		
		
	}
	
	public static void treeBag(){
		Bag<String> bag = new TreeBag<String>();
		
		bag.add("a");
		bag.add("a", 5);
		bag.add("b");
		
		Iterator<String> it = bag.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void hashBag(){
		Bag<String> bag = new HashBag<String>();
		
		bag.add("a");
		bag.add("a", 5);
		
		Iterator<String> it = bag.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
