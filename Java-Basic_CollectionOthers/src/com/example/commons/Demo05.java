package com.example.commons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.commons.collections4.iterators.FilterIterator;
import org.apache.commons.collections4.iterators.LoopingListIterator;
import org.apache.commons.collections4.iterators.UniqueFilterIterator;
import org.apache.commons.collections4.map.HashedMap;

public class Demo05 {

	public static void main(String[] args) {
		//mapIt();
		//uniqueIt();
		//selfIt();
		//loopIt();
		arrIt();
	}
	
	public static void arrIt(){
		int[] ints = {1,2,3,4,5,6,7,8,9};
		
		Iterator<Integer> it = new ArrayListIterator<>(ints);
		//Iterator<Integer> it = new ArrayListIterator<>(ints,1,3);
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void loopIt(){
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10;i++){
			list.add(i+"");
		}
		Iterator<String> it = new LoopingListIterator<>(list);
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	
	public static void mapIt(){
		System.out.println("map������");
		IterableMap<String,String> map = new HashedMap<String,String>();
		for(int i = 0; i < 10; i++ ){
			map.put(i + "", i + "");
			map.put(i + "", i + "");
		}
		
		MapIterator<String, String> it = map.mapIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void uniqueIt(){
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10;i++){
			list.add(i+"");
		}
		Iterator<String> it = new UniqueFilterIterator<String>(list.iterator());
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void selfIt(){
		
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < 10;i++){
			list.add(i+"");
		}
		
		Predicate<String> pre = new Predicate<String>(){

			@Override
			public boolean evaluate(String in) {
				return new StringBuilder(in).reverse().toString().equals(in);
			}
			
		};
		
		Iterator<String> it = new FilterIterator<String>(list.iterator(),pre);
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
