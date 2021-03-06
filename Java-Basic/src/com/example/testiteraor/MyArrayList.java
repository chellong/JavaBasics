package com.example.testiteraor;

import java.util.Iterator;

/**
 * hasNext
 * next
 * @author 北飞的候鸟
 *
 */
public class MyArrayList implements java.lang.Iterable<Integer>{

	private int[] elem = {1,2,3,4,5,6,7,8,9,10};
	private int size = elem.length;
	private int cursor = -1;
	
	public boolean hasNext() {
		/**
		 * 判断是否存在下一个元素
		 */
		return cursor + 1 < size;
	}
	
	public int next(){
		cursor++;
		return elem[cursor];
	}
	
	public void remove(){
		 
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				return cursor + 1 < size;
			}

			@Override
			public Integer next() {
				cursor++;
				return elem[cursor];
			}
		};
	}
	
}
