package com.example.collection;


public class MyLinkedList {

	private LinkedListNode first;
	private LinkedListNode last;
	
	private int size;
	
	public void add(Object obj){
		LinkedListNode n = new LinkedListNode();
		if(first == null){
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
			
			
		}else{
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			last = n;
		}
		size ++;
	}
	
	public int size(){
		return size;
	}
	
	public LinkedListNode node(int index){
		
		LinkedListNode temp = null;
		if(first == null){
			return null;
		}else{
			temp = first;
			for(int i = 0; i < index; i++ ){
				temp = temp.next;
			}
		}
		return temp;
	}
	
	public Object get(int index) {
		
			LinkedListNode node = node(index);
			if(node != null){
				return node.obj;
			}else{
				return null;
			}
	}
	
	public void remove(int index){
		
		LinkedListNode temp = node(index);
		
		if(temp != null){
			LinkedListNode up = temp.getPrevious();
			LinkedListNode down = temp.getNext();
			
			up.next = down;
			down.previous = up;
			
			size--;
		}
	}
	
	public void add(int index,Object obj){

		LinkedListNode temp = node(index);
		LinkedListNode node = new LinkedListNode(null,obj,null);
		
		if(temp != null){
			LinkedListNode up = temp.previous;
			up.next = node;
			node.previous = up;
			node.next = temp; 
			temp.previous = node;
			size ++;
		}
	}
	
	
	
	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();
	}
	
}


