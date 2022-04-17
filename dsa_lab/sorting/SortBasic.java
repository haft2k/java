class SortBasic {

    /** 
     * swap 2 integer
     *
     * @param integer
     *
     */
    void swap(int a, int b) {
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
    }

    /**
     * bubble sort
     * compares adjacent elements
     * swaps if wrong order
     *
     * @param array
     *
     */
    void bubbleSort(int[] arr) {
	/* use function copy array */
	int[] copyArr = copyArray(arr);
	
	for (int i = 0; i < copyArr.length-1; i++) {
	    boolean sorted = false;

	    for (int j = 0; j < copyArr.length-1 - i; i++) {
		if (copyArr[j] > copyArr[j+1]) {
		    swap(j, j+1);
		    sorted = true;
		}
	    }

	    // if sorted
	    if (!sorted) {
		return;
	    }
	}
    
    }

    /**
     * Selection sort
     * @version 1.0
     * @param array
     *
     */
    void selectionSort(int[] arr) {
	int[] copyArr = copyArray(arr);
	
	for (int i = 0; i < copyArr.length - 1; i++) {
	    int min_index = i;

	    /** find minimum element in unsorted array */
	    for (int j = i + 1; j < copyArr.length; j++) {
		
		if (copyArr[min_index] > copyArr[j]) {
		    min_index = j;
		}
		
		// swap the minimum element
		swap(min_index, i);
	    }
	}
    }

    /**
     * seletion sort 
     *
     * @version 2.0
     * @param array
     * 
     */
    void selectionSort2(int[] arr) {
	int[] copyArr = copyArray(arr);

	for (int i = 0; i < copyArr.length - 1; i++) {

	    for (int j = i+1; j < copyArr.length; j++) {
		if (copyArr[i] > copyArr[j]) {
		    swap(i, j);
		}
	    }
	}
    }
    

    /**
     * insertion sort
     * 
     * @param array
     *
     */
    void insertionSort(int[] arr) {
	int[] copyArr = copyArray(arr);

	for (int i = 1; i < copyArr.length; i++) {
	    int prev = i - 1;
	    int temp = copyArr[i];

	    while (prev >= 0 && copyArr[prev] > temp) {
		copyArr[prev+1] = copyArr[prev];
		prev -= 1;
	    }
	    
	    copyArr[prev + 1] = temp;
	}
    }
    
    /**
     * copy array
     *
     * @param array of main array
     *
     * @return array
     */
    int[] copyArray(int[] arr) {
	int[] copyArray = new int[arr.length];

	for (int i = 0; i < arr.length; i++) {
	    copyArray[i] = arr[i];
	}
	return copyArray;
    }

    /**
     * display array
     *
     * @param array
     *
     */
    void display(int[] arr) {
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(arr[i] + " ");
	}

	System.out.println();
    }
}
