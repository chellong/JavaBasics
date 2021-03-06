package com.example.testiteraor;

import java.util.Iterator;

public class MyArrayList_ {

	private int[] elem = { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
	private int size = elem.length;
	private int cursor = -1;

	public Iterator<Integer> iterator(){
		return new Iterator<Integer>() {

			public boolean hasNext() {
				/**
				 * 判断是否存在下一个元素
				 */
				return cursor + 1 < size;
			}

			public Integer next() {
				cursor++;
				return elem[cursor];
			}
		};
	}
		
}
