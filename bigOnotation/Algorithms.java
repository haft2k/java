package bigOnotation;

public class Algorithms {

    public void bubbleSort(int[] arr) {
	System.out.print("Running: .... Almost done!!! ---- > ");

	boolean haveSwap = false;
	final long startMillis = System.currentTimeMillis();
	int[] copyArray = copyArray(arr);

	for (int i = 0; i < copyArray.length - 1; i++) {
	    for (int j = 0; j < copyArray.length - 1 - i; j++) {
		if (copyArray[j] > copyArray[j + 1]) {
		    haveSwap = true;
		    int temp = copyArray[j];
		    copyArray[j] = copyArray[j + 1];
		    copyArray[j + 1] = temp;
		}
	    }
	    if (haveSwap == false) {
		break;
	    }
	}
	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Bubble Sort: " + finalTime + "ms");
    }

    public void selectionSort(int[] arr) {
	System.out.print("Running: .... Almost done!!! ---- > ");

	final long startMillis = System.currentTimeMillis();
	int minIndex;
	boolean haveSwap = false;
	int[] copyArray = copyArray(arr);
	for (int i = 0; i < copyArray.length - 1; i++) {
	    minIndex = i;
	    for (int j = i + 1; j < copyArray.length; j++) {
		if (copyArray[minIndex] > copyArray[j]) {
		    minIndex = j;
		    haveSwap = true;
		}
	    }

	    int temp = copyArray[minIndex];
	    copyArray[minIndex] = copyArray[i];
	    copyArray[i] = temp;
	}
	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Selection Sort: " + finalTime + "ms");
    }

    public void insertionSort(int[] arr) {
	System.out.print("Running: .... Almost done!!! ---- > ");

	final long startMillis = System.currentTimeMillis();
	int[] copyArray = copyArray(arr);

	for (int i = 1; i < arr.length; i++) {
	    int key = arr[i];
	    int j = i - 1;

	    while (j >= 0 && arr[j] > key) {
		arr[j + 1] = arr[j];
		j = j - 1;
	    }
	    arr[j + 1] = key;

	}

	final long endMillis = System.currentTimeMillis();
	final long finalTime = endMillis - startMillis;
	System.out.println("Insertion Sort: " + finalTime + "ms");

    }

    public int[] copyArray(int[] arr) {
	int[] copyArray = new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
	    copyArray[i] = arr[i];
	}
	return copyArray;
    }

    void display(int[] copyArray) {
	for (int i = 0; i < copyArray.length; i++) {
	    System.out.print(copyArray[i] + "  ");
	}
	System.out.println();
    }
}