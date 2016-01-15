package com.example.testiteraor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 * 
 * @author 北飞的候鸟
 *
 */
public class TestMap {

	public static void exam(List<Student> list){
		list.add(new Student("1",1,1));
		list.add(new Student("2",2,2));
		list.add(new Student("3",3,3));
		list.add(new Student("4",4,4));
	}
	
	public static void count(Map<String,ClassRome> map,List<Student> list){
		for(Student s : list){
			String no = s.getNo() + "";
			double score = s.getScore();

			ClassRome room = map.get(no);
			if(room == null){
				room = new ClassRome();
				map.put(no, room);
			}
			
			room.setNo(no);
			room.setTotal(room.getTotal() + score);
			room.getStus().add(s);
		}
	}
	
	public static void printScore(Map<String,ClassRome> map){
		
		Set<Map.Entry<String, ClassRome>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, ClassRome>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, ClassRome> entry = it.next();
			ClassRome room = entry.getValue();
			System.out.print("班号位：" + room.getNo());
			System.out.println("总分为：" + room.getTotal());
		}
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		exam(list);
		Map<String,ClassRome> map = new HashMap<String, ClassRome>();
		count(map,list);
		printScore(map);
		
		
	}
	
	
}
