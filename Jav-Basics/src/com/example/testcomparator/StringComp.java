package com.example.testcomparator;

import java.util.Comparator;

public class StringComp implements Comparator<String> {

	/**
	 * ���� >
	 * ���� <
	 * 0 ==
	 */
	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();
		return len1-len2;
	}

}