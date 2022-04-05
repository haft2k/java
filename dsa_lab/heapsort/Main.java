package lecture9_heapsort;


class Main {
    public static void main(String[] args) {
	int[] array = {7, 3, 5, 9, 11, 8, 6, 15, 10, 12, 14, 4};
	HeapSort hS = new HeapSort();

	hS.sort(array);
	hS.display(array);
	System.out.println();
    }
}
