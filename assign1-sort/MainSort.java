package assignment1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainSort {

    public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);

	int choice;
	int[] arr = null;

	Algorithms algo = new Algorithms();

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

	    // funtion 1 to 7
	    // use switch case with input choice
	    switch (choice) {

	    // Write data array to file input.txt
	    case 1: {
		System.out.print("Input number of elements: ");
		int inputNumber = Integer.parseInt(scanner.next());
		arr = new int[inputNumber];

		// use method testElement() random number int
		System.out.println("Input elements: ");
		for (int i = 0; i < inputNumber; i++) {
		    arr[i] = testElemetRandom();
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
		// Call method insertion Sorting arr to copyArry
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

    /**
     * test input elements random number int %.f if use method for test change
     * value input element for arr index
     *
     */
    static int testElemetRandom() {
	Random random = new Random();
	int rangeRandom = random.nextInt(100);
	int rounding = (int) (Math.ceil(rangeRandom * 10) / 10);
	return rounding;
    }

}
