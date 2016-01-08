package com.example.testalgorithm;

/**
 * 
 * 二分查找 查找前数组必须有序
 * 
 * @author 北飞的候鸟
 *
 */
public class BinarySearch {

	/**
	 * 
	 * @param srcArray
	 * @param des
	 * @return
	 */
	public static int binarySearch(int[] srcArray, int des) {

		int left = 0;
		int right = srcArray.length - 1;

		while (( left<= right)
				//防止越界
				&& ( left<= srcArray.length - 1)
				&& (right <= srcArray.length - 1)) {
			
			//除以二，速度比直接除要快
			int middle =  + ((right - left) >> 1);
			
			if (des == srcArray[middle]) {
				
				return middle;
			} else if (des < srcArray[middle]) {
				
				right = middle - 1;
			} else {
				
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int s = BinarySearch.binarySearch(a, 5);
		System.out.println(s);
	}

}
