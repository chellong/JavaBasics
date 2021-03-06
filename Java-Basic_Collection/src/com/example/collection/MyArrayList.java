package com.example.collection;

/**
 * 1、idea
 * 
 * @author 北飞的候鸟
 *
 */
@SuppressWarnings("unused")
public class MyArrayList {

	private transient Object[] elementDate;

	private int size;

	public MyArrayList() {
		this(10);
	}

	public MyArrayList(int initialCapacity) {
		if (initialCapacity < 0) {
			try {
				throw new Exception("initialCapacity < 0");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementDate = new Object[initialCapacity];
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private boolean isEmptoy() {
		return size == 0;
	}

	private void add(Object obj) {

		// 如果数组扩容
		ensureCapacityInternal(size);
		this.elementDate[size++] = obj;
	}
	
	private void add(int index,Object obj) {

		 if (index > size || index < 0)
				 throw new IndexOutOfBoundsException();
		 
		ensureCapacityInternal(size + 1); 
		System.arraycopy(elementDate, index, elementDate, index + 1,
                size - index);
		elementDate[index] = obj;
		size++;
		
	}

	private void ensureCapacityInternal(int i) {
		if (size + 1 > elementDate.length) {
			Object[] newArray = new Object[(size + 1) * 2];
			System.arraycopy(elementDate, 0, newArray, 0, elementDate.length);
			this.elementDate = newArray;
		}
	}

	private Object get(int index) {
		check(index);
		return elementDate[index];
	}

	private Object remove(int index) {
		check(index);
		int numMoved = size - index - 1;
		Object oldValue = elementDate[index];
		if (numMoved > 0)
			System.arraycopy(elementDate, index + 1, elementDate, index,
					numMoved);
		elementDate[--size] = null; // clear to let GC do its work
		return oldValue;
	}
	
	private boolean remove(Object obj) {

		for(int i = 0;i <= size;i++ ){
			if(obj.equals(elementDate[i])){
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Object set(int index,Object obj){
		
		Object oldObject = elementDate[index];
		elementDate[index] = obj;
		return oldObject;
		
	}

	private void check(int index) {

		if (index < 0 || index >= size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}

		
		System.out.println(list.remove(1));
		System.out.println(list.size);
		
	}

}
