package assignment1;

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

public class Algorithms {

    /**
     *
     * Writing the array read from input array arr to file
     *
     * @param fileName The file name of file to write value
     *
     * @param arr      The input float array
     * @throws IOException
     *
     */

    public void writeFile(String fileName, float[] arr) throws IOException {
	FileWriter file = new FileWriter(fileName);

	BufferedWriter buffer = new BufferedWriter(file);
	String text = "";
	for (float item : arr) {
	    text += item + "\n";
	}
	// Program write array to file input.txt
	buffer.write(text);

	// Close program write
	buffer.close();
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
     * Reading the file then input to the array float[] arr
     *
     * @param fileName The file name of file to read
     *
     * @param arr      The output float array that will contain value read from file
     * @throws FileNotFoundException
     *
     *
     *
     */

    // return array float arr change value from input.txt
    public float[] readFile(String fileName, float[] arr) throws IOException {
	File file = new File(fileName);
	InputStream inputStream = new FileInputStream(file);
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	BufferedReader reader = new BufferedReader(inputStreamReader);

	String line;
	// Use split() breaks a given string
	// Add to Array String
	ArrayList<Float> arrListFloat = new ArrayList<Float>();

	while ((line = reader.readLine()) != null) {
	    float a = Float.parseFloat(line);
	    arrListFloat.add(a);
	}

	arr = new float[arrListFloat.size()];
	for (int i = 0; i < arr.length; i++) {
	    arr[i] = arrListFloat.get(i);
	}
	System.out.println(Arrays.toString(arr));
	return arr;
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

    public float[] bubbleSort(float[] arr) {
	float[] copyArray = copyArray(arr);
	
	for (int i = 0; i < copyArray.length - 1; i++) {

	    boolean isSorted = false;

	    for (int j = 0; j < copyArray.length - 1 - i; j++) {
		if (copyArray[j] > copyArray[j + 1]) {
		    isSorted = true;
		    float temp = copyArray[j];
		    copyArray[j] = copyArray[j + 1];
		    copyArray[j + 1] = temp;
		}
	    }
	    display(copyArray);

	    //
	    if (isSorted == false) {
		break;
	    }
	}
	return copyArray;
    }

    /**
     *
     * Sorting the input array arr using Selection Sort algorithm.
     *
     * @param copyArray Input array using for sorting
     *
     * @return Returning a sorted array by using the Selection Sort algorithm
     *
     */

    public float[] selectionSort(float[] arr) {
	int minIndex;
	float[] copyArray = copyArray(arr);
	for (int i = 0; i < copyArray.length - 1; i++) {
	    minIndex = i;
	    for (int j = i + 1; j < copyArray.length; j++) {
		if (copyArray[minIndex] > copyArray[j]) {
		    minIndex = j;
		}
	    }
	    float temp = copyArray[minIndex];
	    copyArray[minIndex] = copyArray[i];
	    copyArray[i] = temp;

	    display(copyArray);

	}
	return copyArray;
    }

    /**
     *
     * Sorting the input array arr using Insertion Sort algorithm.
     *
     * @param copyArray Input array using for searching
     *
     * @return Returning a sorted array by using the Insertion Sort algorithm
     *
     */

    public float[] insertionSort(float[] arr) {
	float[] copyArray = copyArray(arr);

	for (int i = 1; i < copyArray.length; i++) {
	    float hold = copyArray[i];
	    int j = i - 1;

	    while (j >= 0 && copyArray[j] > hold) {
		copyArray[j + 1] = copyArray[j];
		j = j - 1;
	    }
	    copyArray[j + 1] = hold;

	    display(copyArray);

	}
	return copyArray;

    }

    /**
     *
     * Searching the indices of elements in array [arr] greater than value. Printing
     *
     * and writing all indices to the console screen and file OUTPUT4.TXT separated
     * by space.
     *
     * @param arr   Input array using for searching
     *
     * @param value The value for searching
     * @throws IOException
     *
     */

    public void search(float[] arr, float value) throws IOException {
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

    public int binarySearch(float[] arr, int left, int right, float value) throws IOException {
	int mid = 0;

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

    
    public float[] copyArray(float[] arr) {
	float[] copyArray = new float[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    copyArray[i] = arr[i];
	}
	return copyArray;
    }

    void display(float[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + "  ");
	}
	System.out.println();
    }
}
