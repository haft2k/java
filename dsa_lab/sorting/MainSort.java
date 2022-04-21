/*
 * @version 1.0 April 21, 2022
 *
 * Copyright (c) April 21, 2022 - 20?? GumBox, Inc.
 * Address....................
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of GumBox, Inc
 * ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with GumBox
 */
package sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
 */
public class MainSort {

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);

	int choice;
	int[] arr = null;

	Sorting algo = new Sorting();

	/* function program */
	do {
	    menu();
	    System.out.print("Choice your option: ");
	    choice = Integer.parseInt(scanner.next());

	    // Function choice == 0 end program
	    if (choice == 0) {
		System.out.println("Have nice day. Good bye");
		break;
	    }

	    /**
	     * funtion 1 to 7 use switch case with input choice
	     */
	    switch (choice) {

	    // Write data array to file input.txt
	    case 1: {
		System.out.print("Input number of elements: ");
		int inputNumber = Integer.parseInt(scanner.next());
		arr = new int[inputNumber];

		// use method testElement() random number integer
		System.out.println("Inputing elements. Please wait a fer second!!! ");
		for (int i = 0; i < inputNumber; i++) {
		    arr[i] = numberRandom();
		}

		algo.writeFile("input.txt", arr);

		break;
	    }

	    // method readFile() of class Algorithms
	    // read file data array of input.txt of case 1
	    case 2: {
		System.out.println("Read from file:");
		System.out.print("Array: ");
		arr = algo.readFile("input.txt", arr);
		break;
	    }

	    // Bubbler Sort
	    case 3: {

		int[] copyArray = algo.bubbleSort(arr);
		// write file array sort to file output1.txt
		algo.writeFile("output1.txt", copyArray);

		break;
	    }

	    // Selection sort
	    case 4: {
		int[] copyArray = algo.selectionSort(arr);
		// write file array sort to file output2.txt
		algo.writeFile("output2.txt", copyArray);

		break;
	    }

	    // Insertion Sort
	    case 5: {
		int[] copyArray = algo.insertionSort(arr);
		// write file array sort to file output3.txt
		algo.writeFile("output3.txt", copyArray);

		break;
	    }

	    // Linear Search
	    case 6: {
		System.out.print("Choose number search: ");
		int value = Integer.parseInt(scanner.next());
		algo.search(arr, value);
		break;
	    }

	    // Binary Search
	    case 7: {
		// Call method insertion Sorting array to copyArry
		//
		int[] copyArray = algo.insertionSort(arr);
		ArrayList<Integer> indexArray = new ArrayList<Integer>();

		System.out.print("Choose number search: ");
		int value = Integer.parseInt(scanner.next());
		int a = algo.binarySearch(copyArray, 0, arr.length - 1, value);

		if (a == -1) {
		    System.out.println("Your number no have in Array. Please try again");
		} else {
		    System.out.println("Your index number you want search is: " + a);
		}
		//
		indexArray.add(a);
		algo.searchWriteFile("output5.txt", indexArray);
		break;
	    }

	    default:
		throw new IllegalArgumentException("Unexpected value: " + choice);

	    }
	} while (true);

    }

    /**
     * create number random and range 0-499
     *
     * @return integer
     */
    static int numberRandom() {
	Random random = new Random();
	int rangeRandom = random.nextInt(500);
	return rangeRandom;
    }

    static void menu() {
	System.out.println("+ ======================= +");
	System.out.println("||    1. Input           ||");
	System.out.println("||    2. Output          ||");
	System.out.println("||    3. Bubble Sort     ||");
	System.out.println("||    4. Selection Sort  ||");
	System.out.println("||    5. Insertion Sort  ||");
	System.out.println("||    6. Search > value  ||");
	System.out.println("||    7. Search = value  ||");
	System.out.println("||    0. Exit            ||");
	System.out.println("+ ======================= +");
    }

}
