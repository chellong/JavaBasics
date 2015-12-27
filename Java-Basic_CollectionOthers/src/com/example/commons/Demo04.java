package com.example.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.functors.SwitchTransformer;

public class Demo04 {

	public static void main(String[] args) {
		
		System.out.println("自定义转换");
		
		Predicate<Employee> isLow = new Predicate<Employee>(){

			@Override
			public boolean evaluate(Employee em) {
				return Integer.parseInt(em.getSalary()) < 10000;
			}
			
		};
		
		Predicate<Employee> isHight = new Predicate<Employee>(){

			@Override
			public boolean evaluate(Employee em) {
				return Integer.parseInt(em.getSalary()) > 10000;
			}
		};
		
		@SuppressWarnings("rawtypes")
		Predicate[] pree = {isLow,isHight};
		
		Transformer<Employee,Level> lowTrans = new Transformer<Employee, Level>() {
			
			@Override
			public Level transform(Employee in) {
				return new Level(in.getName(),"卖身中");
			}
		};
		
		Transformer<Employee,Level> highTrans = new Transformer<Employee, Level>() {
			
			@Override
			public Level transform(Employee in) {
				return new Level(in.getName(),"养身中");
			}
		};
		
		@SuppressWarnings("rawtypes")
		Transformer[] trans = {lowTrans,highTrans};
		
		@SuppressWarnings({ "rawtypes", "unchecked" })
		Transformer switchTrans = new SwitchTransformer(pree,trans,null);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("1",10000 + ""));
		list.add(new Employee("2",1000 + ""));
		
		@SuppressWarnings("unchecked")
		Collection<Level> lls = CollectionUtils.collect(list, switchTrans);
		
		Iterator<Level> it = lls.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
			
	}
}
