
class HeapSort {

    /**
     * Constructor
     *
     */
    HeapSort() {}

    /**
     * heap sort
     *
     */
    void sort(int[] array) {

	for (int i=array.length/2-1; i>=0; i--) {

	    heapify(array, array.length, i);
	}

	
	for (int i=array.length-1; i>0; i--) {

	    int temp = array[0];
	    array[0] = array[i];
	    array[i] = temp;

	    // call max heapify on the reduced heap
	    heapify(arr, i, 0);
	}
    }

     /**
     * Heapify Change Position
     *
     */
    void heapify(int[] array, int length, int index) {
	int largest = index;
	left = 2 * index + 1;
	right = 2 * index + 2;

	// if left child is larger than parent
	if (left < length && array[left] > array[largest]) {
	    largest = left;
	}

	// if right child is larger than parent
	if (right < length && arr[right] > array[largest]) {
	    largest = right;
	}

	// if largest is not root
	if (largest != index) {
	    int temp = array[index];
	    array[index] = array[largest];
	    array[largest] = temp;

	    // recursively heapify the afected sub-tree
	    heapify(array, length, largest);
	}


    }
}
