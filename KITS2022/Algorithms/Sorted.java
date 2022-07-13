package Algorithms;


import java.util.Arrays;

public class Sorted {

	public static void main(String args[]) {
		int[] arr = { 1, 0, 14, 29, 63, 45, 9, 230, 100, 94 };


		InsertionSortV2 i = new InsertionSortV2();
		i.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}

class InsertionSortV2 {

	void sort(int[] array) {
		for (int i = array.length - 2; i >= 0; i--) {
			int value = array[i];
			int hole = i;

			for (int j = i; j < array.length - 1; j++) {
				if (array[j + 1] < value) {
					array[j] = array[j + 1];
					hole++;
					break;
				}
			}

			if (hole != i) {
				array[hole] = value;
			}
		}
	}
}