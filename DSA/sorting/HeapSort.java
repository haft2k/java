package sorting;

 //import <name>

/**
 * @version 1.00
 * @since July 09, 2022 GumBox Inc.
 * @author falc0n (https://www.github.com/haft2k)
 */

class HeapSort {
    /**
     * Constructor
     *
     * @param array integer
     *
     */
    HeapSort() {}

    /**
     * display heap
     *
     */
    void display(int[] array) {
	for (int i=0; i<array.length; i++) {
	    System.out.print(array[i] + " ");
	}
	System.out.println();

    }

    /**
     * Heap sort
     *
     */
    void sort(int[] array) {

	for (int i = array.length/2 - 1; i >= 0; i--) {
	    heapify(array, array.length, i);
	}

	// one by one extract an element from heap
	for (int i = array.length-1; i >= 0; i--) {
	    /* move current root element to end */
	    int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

	    heapify(array, i, 0);
	}

    }

    /**
     * To heapify a subtree rooted with node i which is
     *
     * @param array, length arr, index
     */
    void heapify(int[] array, int length, int index) {
	// initialize largest as root
	int largest = index;

	// left && right
	int left = 2*index + 1;

	int right = 2*index + 2;

	// if left child is larger than parent
	if (left < length && array[left] > array[largest]) {
	    largest = left;
	}

	// if right child is larger than parent
	if (right < length && array[right] > array[largest]) {
	    largest = right;
	}

	// if largest is not parent
	if (largest != index) {

	    int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;

	    // recursively heapify the affected sub-tree
	    heapify(array, length, largest);
	}
    }

}
