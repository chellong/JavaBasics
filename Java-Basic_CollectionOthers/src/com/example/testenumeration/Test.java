package com.example.testenumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		for(int i = 0; i < 10; i++){
			v.add(i + "");
		}
		
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
