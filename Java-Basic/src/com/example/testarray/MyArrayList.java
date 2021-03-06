package com.example.testarray;

public class MyArrayList {

	/**
	 * 
	 */
	private Object[] value;

	/**
	 * 
	 */
	private int size;

	public MyArrayList() {
		value = new Object[16];
	}

	public MyArrayList(int size) {
		value = new Object[size];
	}

	public void add(Object obj) {
		value[size] = obj;
		size++;
		if (size >= value.length) {
			int newCapacity = value.length * 2 + 2;
			Object[] newList = new Object[newCapacity];
			// System.arraycopy(src, srcPos, dest, destPos, length);
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}
			value = newList;
			System.gc();
		}
	}

	public Object get(int index) {

		if (index < 0 && index > size - 1) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value[index];
	}

	public int getSize() {
		return size;
	}
	
	/**
	 * 
	 * Object ������
	 * 
	 * @param obj
	 * @return
	 */
	public int indexOf(Object obj){
		
		if(obj == null){
			return -1;
		}else{
			for(int i = 0; i < value.length; i++){
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	

	public int lastIndexOf(Object obj){
		
		if(obj == null){
			return -1;
		}else{
			for(int i = value.length - 1; i >=0; i--){
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	
	public void set(int index,Object obj){
		
		if(index < 0 || index > size -1){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value[index] = obj; 
	}
	
	

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.add("123");
		System.out.println(list.get(0));
	}

}
