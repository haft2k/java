package sorting;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @version 1.00
 * @since July 09, 2022 GumBox Inc.
 * @author falcon (https://www.github.com/haft2k)
 */

public class Sorting {

    /**
     * copy data array parameter to copyArray
     *
     * @param arr
     * @return
     */
    public int[] copyArray(int[] arr) {
	int[] copyArray = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    copyArray[i] = arr[i];
	}
	return copyArray;
    }

    /**
     * Print array
     *
     * @param arr
     */
    void display(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + "  ");
	}
	System.out.println();
    }

    /**
     * swap function
     *
     * @param 2 integer
     *
     */
    void swap(int[] arr, int a, int b) {
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
    }

    /**
     *
     * Writing the array read from input array arr to file
     *
     * @param fileName The file name of file to write value
     *
     * @param arr      The input int array
     * @throws IOException
     *
     */

    public void writeFile(String fileName, int[] arr) throws IOException {
	FileWriter file = new FileWriter(fileName);

	BufferedWriter buffer = new BufferedWriter(file);
	String text = "";
	for (int item : arr) {
	    text += item + "\n";
	}
	// Program write array to file input.txt
	buffer.write(text);

	// Close program write
	buffer.close();
    }

    /**
     *
     * Reading the file then input to the array int[] arr
     *
     * @param fileName The file name of file to read
     *
     * @param arr      The output int array that will contain value read from file
     * @throws FileNotFoundException
     *
     *
     * @return array
     */
    public int[] readFile(String fileName, int[] arr) throws IOException {
	File file = new File(fileName);
	InputStream inputStream = new FileInputStream(file);
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	BufferedReader reader = new BufferedReader(inputStreamReader);

	String line;
	// Use split() breaks a given string
	// Add to Array String
	ArrayList<Integer> arrListInt = new ArrayList<Integer>();

	while ((line = reader.readLine()) != null) {
	    int a = Integer.parseInt(line);
	    arrListInt.add(a);
	}

	arr = new int[arrListInt.size()];
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = arrListInt.get(i);
	}
	System.out.println(Arrays.toString(arr));
	return arr;
    }

    public void searchWriteFile(String fileName, ArrayList<Integer> indexArray) throws IOException {
	FileWriter file = new FileWriter(fileName);

	BufferedWriter buffer = new BufferedWriter(file);
	String text = "";
	for (int item : indexArray) {
	    text += item + " ";
	}
	// Program write array to file input.txt
	buffer.write(text);

	// Close program write
	buffer.close();
    }

    /**
     *
     * Sorting the input array arr using Bubble Sort algorithm.
     *
     * @param copyArray Input array using for sorting
     *
     * @return Returning a sorted array by using the Bubble Sort algorithm
     *
     */

    public int[] bubbleSort(int[] arr) {
	int[] copyArray = copyArray(arr);

	final long startMillis = System.currentTimeMillis();

	for (int i = 0; i < copyArray.length - 1; i++) {
	    boolean isSorted = false;
	    for (int j = 0; j < copyArray.length - 1 - i; j++) {
		if (copyArray[j] > copyArray[j + 1]) {
		    isSorted = true;

		    // use funciton swap change position
		    swap(copyArray, j, j + 1);
		}
	    }
	    // display array
	    display(copyArray);

	    if (isSorted == false) {
		break;
	    }
	}
	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Bubble Sort: " + finalTime + "ms");

	return copyArray;
    }

    /**
     *
     * Sorting the input array arr using Selection Sort algorithm.
     *
     * @param copyArray Input array using for sorting
     *
     * @return Returning a sorted array by using the Selection Sort algorithm
     */
    public int[] selectionSort(int[] arr) {
	int minIndex;
	int[] copyArray = copyArray(arr);

	final long startMillis = System.currentTimeMillis();

	for (int i = 0; i < copyArray.length - 1; i++) {
	    minIndex = i;
	    for (int j = i + 1; j < copyArray.length; j++) {
		if (copyArray[minIndex] > copyArray[j]) {
		    minIndex = j;
		}
	    }

	    swap(copyArray, minIndex, i);
	    display(copyArray);

	}

	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Selection Sort: " + finalTime + "ms");

	return copyArray;
    }

    /**
     *
     * Sorting the input array using Insertion Sort algorithm.
     *
     * @param copyArray Input array using for searching
     *
     * @return Returning a sorted array by using the Insertion Sort algorithm
     */
    public int[] insertionSort(int[] arr) {
	int[] copyArray = copyArray(arr);
	System.out.print("Running: .... Almost done!!! ---- > ");
	final long startMillis = System.currentTimeMillis();

	/* sorting */
	for (int i = 1; i < copyArray.length; i++) {
	    int hold = copyArray[i];
	    int j = i - 1;

	    /* locate hole position for the element to be insert */
	    while (j >= 0 && copyArray[j] > hold) {
		copyArray[j + 1] = copyArray[j];
		j = j - 1;
	    }

	    copyArray[j + 1] = hold;

	    display(copyArray);

	    // end sort
	}

	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Insertion Sort: " + finalTime + "ms");

	return copyArray;

    }

    /**
     *
     * Searching the indices of elements in array greater than value. Printing
     *
     * and writing all indices to the console screen and file OUTPUT4.TXT separated
     * by space.
     *
     * @param arr   Input array using for searching
     *
     * @param value The value for searching
     * @throws IOException
     */
    public void search(int[] arr, int value) throws IOException {
	ArrayList<Integer> indexArray = new ArrayList<Integer>();
	boolean a = false;

	System.out.print("Index have number greater than number you want search: ");
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] > value) {
		System.out.print(i + " ");
		indexArray.add(i);
		a = true;
	    }
	}
	System.out.println();
	if (a == false) {
	    System.out.println("Sorry no have index number greater than your number..");
	}
	System.out.println();

	// write index of number greater than
	searchWriteFile("output4.txt", indexArray);
    }

    /**
     *
     * Searching by using the Binary Search algorithm. Returning the first index of
     *
     * value if it is present in array arr, otherwise, return -1. The index also
     *
     * written to file OUTPUT5.TXT and shown on the console screen.
     *
     * @param arr   Input array using for searching
     *
     * @param left  The left index
     *
     * @param right The right index
     *
     * @param value The value for searching
     *
     * @return The index of the element if found, otherwise, return -1
     * @throws IOException
     *
     */
    public int binarySearch(int[] arr, int left, int right, int value) throws IOException {
	int mid = 0;
	if (arr[mid] == value) {
	    return mid;
	}
	if (right >= left) {

	    mid = left + (right - left) / 2;

	    // If the element is present at the
	    // middle itself
	    if (arr[mid] == value) {
		return mid;
	    }

	    // If element is smaller than mid, then
	    // it can only be present in left subarray
	    if (arr[mid] > value) {
		return binarySearch(arr, left, mid - 1, value);
	    }

	    // Else the element can only be present
	    // in right subarray
	    return binarySearch(arr, mid + 1, right, value);
	}
	// We reach here when element is not present in array
	return -1;

    }

}
