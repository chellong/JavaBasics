package com.example.collection;


/**
 * 1���ڵ�
 * 
 * @author ���ɵĺ���
 *
 */

public class LinkedListNode{
	
	 LinkedListNode previous;
	 Object obj;
	 LinkedListNode next;
	
	
	
	public LinkedListNode() {
		super();
	}
	
	
	



	public LinkedListNode(LinkedListNode previous, Object obj, LinkedListNode next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}


	public LinkedListNode getPrevious() {
		return previous;
	}



	public void setPrevious(LinkedListNode previous) {
		this.previous = previous;
	}



	public Object getObj() {
		return obj;
	}



	public void setObj(Object obj) {
		this.obj = obj;
	}



	public LinkedListNode getNext() {
		return next;
	}



	public void setNext(LinkedListNode next) {
		this.next = next;
	}
	
	
	
	
}