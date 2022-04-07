class QuickSort {

    /**
     * function swap two int
     *
     * @param array, integer, integer
     *
     */
    void swap(int[] arr, int a, int b) {
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
    }
    
    /**
     * function take last element as pivot
     * all element smaller pivot in left
     * all element greater than pivot in right
     *
     * @param array, integer, integer
     *
     * @return
     */
    int partition(int[] arr, int starts, int ends) {
	/* pivot */
	int pivot = arr[ends];

	/* index of smaller element
	 * indicates the right position
	 * of pivot so far
	 */
	int i = starts - 1;

	for (int j = starts; j <= ends; j++) {
	    if (arr[j] < pivot) {

		// use function swap()
		swap(arr, arr[i], arr[j]);

		// increment index of
		i++;
	    }
	}
	
        swap(arr, i + 1, end);

	return (i+1);
	    
    }

    /**
     * sort 
     */
    voi sort(int[] arr, starts, ends) {
	if (start < ends) {

	    int pivot = partition(arr, starts, ends);

	    sort(arr, start, pivot-1);
	    sort(arr, pivot+1, ends);
	}
    }
    
}
