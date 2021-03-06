package com.example.commons;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

public class Demo03 {

	public static void main(String[] args) {
		System.out.println("内置类型转换，长整星转时间");
		
		Transformer<Long, String> trans = new Transformer<Long, String>(){

			@Override
			public String transform(Long in) {
				return new SimpleDateFormat("yyyy-MM-dd").format(in);
			}
			
		};
		
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < 10; i++){
			list.add((System.currentTimeMillis() + i));
		}
		
		Collection<String> ls = CollectionUtils.collect(list, trans);
		
		
		for(String s : ls){
			System.out.println(s);
		}
		
	}
}
