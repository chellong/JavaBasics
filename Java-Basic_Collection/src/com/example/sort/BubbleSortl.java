package com.example.sort;

import java.util.Arrays;

public class BubbleSortl {

	public static void main(String[] args) {

		int[] arr = { 1,5,9,6,2,3,4,8,7 };
		boolean sorted = true;
		for (int j = 0; j < arr.length; j++) {
			sorted = true;
			System.out.print("��" + (j + 1) + "��");
			for (int i = 0; i < arr.length - 1 - j; i++) {
				if (arr[i] > arr[i + 1]) {
					System.out.println("��" + (i + 1) + "��");
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
				System.out.println(Arrays.toString(arr));
			}
			if (sorted)
				break;
		}

		for (int s : arr) {
			System.out.println(s);
		}
	}
}