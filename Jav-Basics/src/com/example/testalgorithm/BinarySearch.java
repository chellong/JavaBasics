package com.example.testalgorithm;

/**
 * 
 * ���ֲ��� ����ǰ�����������
 * 
 * @author ���ɵĺ���
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
				//��ֹԽ��
				&& ( left<= srcArray.length - 1)
				&& (right <= srcArray.length - 1)) {
			
			//���Զ����ٶȱ�ֱ�ӳ�Ҫ��
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
