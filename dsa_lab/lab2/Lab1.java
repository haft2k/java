package lab2;

import java.util.Scanner;

class SimpleBubbleSort {
    int[] arr;
    int n;

    // Constructor
    public SimpleBubbleSort(int[] cols) {
	n = cols.length;
	arr = new int[n];

	for (int i = 0; i < n; i++) {
	    arr[i] = cols[i];
	}
    }

    void display() {
	for (int i = 0; i < n; i++) {
	    System.out.print(" " + arr[i]);
	}
	System.out.println();
    }

    void swap(int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
    }

    void bubbleSort() {

	for (int i = 0; i < arr.length; i++) {
	    for (int j = 0; j < arr.length - 1 - i; j++) {
		if (arr[j] > arr[j + 1]) {
		    swap(j, j + 1);
		}
		display();
	    }

	}

    }
}

public class Lab1 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int choice;
	int[] arr = { 5, 7, 11, 3, 9, 2, 6 };

	SimpleBubbleSort sort = new SimpleBubbleSort(arr);

	sort.bubbleSort();
    }

}
