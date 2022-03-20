package bigOnotation;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Algorithms algo = new Algorithms();
	int[] arr = null;

	int choice;
	do {
	    menu();
	    System.out.print("Choice your option: ");
	    choice = Integer.parseInt(scanner.next());
	    // Function choice == 0 end program
	    if (choice == 0) {
		System.out.println("Have nice day. Good bye");
		break;
	    }

	    switch (choice) {
	    case 1: {
		System.out.print("Input number of elements: ");
		int inputNumber = Integer.parseInt(scanner.next());
		arr = new int[inputNumber];

		// use method dataRandom() random number float
		for (int i = 0; i < inputNumber; i++) {
		    arr[i] = dataRandom();
		}
		break;
	    }

	    case 2: {
		algo.bubbleSort(arr);
		break;
	    }

	    case 3: {
		algo.selectionSort(arr);
		break;
	    }

	    case 4: {
		algo.insertionSort(arr);
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
	System.out.println("||    2. Bubble Sort     ||");
	System.out.println("||    3. Selection Sort  ||");
	System.out.println("||    4. Insertion Sort  ||");
	System.out.println("||    0. Exit            ||");
	System.out.println("+ ======================= +");
    }

    static int dataRandom() {
	Random random = new Random();
	int rangeRandom = random.nextInt(100);
	return rangeRandom;
    }
}
