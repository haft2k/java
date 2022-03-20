package lab2;

import java.util.Scanner;

class SimpleSort {
    private int[] arr;
    private int minIndex;

    // Constructor
    public SimpleSort(int[] a) {
	arr = new int[a.length];

	for (int i = 0; i < a.length; i++) {
	    arr[i] = a[i];
	}
    }

    // Method Sorting

    void selectSort() {
	for (int i = 0; i < arr.length; i++) {
	    minIndex = i;
	    for (int j = i + 1; j < arr.length; j++) {
		if (arr[minIndex] > arr[j]) {
		    minIndex = j;
		}
		swap(minIndex, j);

	    }
	}
    }

    void insertSort() {

    }

    void swap(int minIndex, int nextNum) {
	int tmp = arr[minIndex];
	arr[minIndex] = arr[nextNum];
	arr[nextNum] = tmp;
    }

    // Binary Search
//    static int search(int value) {
//
//    }

    void display() {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}
	System.out.println();
    }

}

public class Lab2 {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int choice;
	int[] arr = { 5, 7, 11, 3, 9, 2, 6 };
	SimpleSort sort = new SimpleSort(arr);

	while (true) {
	    menu();
	    choice = Integer.parseInt(scanner.nextLine());

	    if (choice == 0) {
		System.out.println("Good bye, have cols nice day");
		break;
	    }

	    switch (choice) {

	    case 1:
		sort.display();
		break;
	    case 2:
		sort.selectSort();
		sort.display();
		break;
	    case 3:
		sort.insertSort();
		sort.display();
		break;
	    case 4:
		//System.out.println(sort.binarySearch() + " ");
		break;
	    default:
		System.out.println("***Invalid choice. Try again***");
		break;
	    }
	}
    }

    static void menu() {
	System.out.println("Choose your option");
	System.out.println("1. Display Data");
	System.out.println("2. Selection Sort");
	System.out.println("3. Insertion Sort");
	System.out.println("4. Binary Search");
	System.out.println("0. Exit");
	System.out.print("Your choice: ");
    }
}
