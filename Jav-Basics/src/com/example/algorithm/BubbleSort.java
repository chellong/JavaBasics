package com.example.algorithm;

import java.util.Arrays;

/**
 * 
 * Ã°ÅÝÅÅÐò
 * 
 * @author ±±·ÉµÄºòÄñ
 *
 */
public class BubbleSort {

	public static void sort(int[] values){
		
		int temp;
		
		for(int i = 0; i < values.length ; i++){
			for(int j = 0; j < values.length - 1 - i;j++){
				if(values[j] > values[j+1]){
					temp = values[j];
					values[j] = values[j + 1];
					values[j + 1] = temp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {

		int[] a = {3,5,7,9,1,4,6,8,2,0};
		BubbleSort.sort(a);
		System.out.println(Arrays.toString(a));
	}

}
