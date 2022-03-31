
public class Main {
    public static void main(String[] args) {
	int[] arr = {7, 3, 5, 9, 11, 8, 6, 15, 10, 12, 14};
	HeapSort hS = new HeapSort();

	hS.sort(arr);
	hS.display(arr);
	System.out.println();
    }
}
