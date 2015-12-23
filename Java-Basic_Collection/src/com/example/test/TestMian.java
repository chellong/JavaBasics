package com.example.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMian {

	public static void main(String[] args) {
		
		//DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		List<Employee> list = new ArrayList<>();
		Date date = new Date(); 
		
		Employee e = new Employee(0001,"0001",2000,"0001",date);
		Employee f = new Employee(0002,"0002",2000,"0002",date);
		Employee g = new Employee(0003,"0003",2000,"0003",date);
		Employee h = new Employee(0003,"0003",2000,"0003",date);
		
		
		list.add(e);
		list.add(f);
		list.add(g);
		list.add(h);
		
		for(Employee em : list){
			System.out.println(em);
		}
		
		
	}
}
