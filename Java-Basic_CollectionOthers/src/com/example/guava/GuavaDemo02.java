package com.example.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Sets;

public class GuavaDemo02 {


	public static void main(String[] args) {
		Set<Long> set = Sets.newHashSet();
		set.add(System.currentTimeMillis());
		set.add(System.currentTimeMillis() + 1);
		set.add(200000000L);
		
		Collection<String> timeStr = Collections2.transform(set, 

				new Function<Long, String>() {

					@Override
					public String apply(Long in) {
						return new SimpleDateFormat("yyyy-MM-dd").format(in);
					}
				});
		
		for(String s : timeStr){
			System.out.println(s);
		}
	}
}
