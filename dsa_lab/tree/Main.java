package lecture6_tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	int[] arr = new int[100];
	int random;
	for (int i = 0; i < 100; i++) {
	    random = (int) (Math.random() * 100) + 1;
	    arr[i] = random;
	}
	System.out.println(Arrays.toString(arr));

    }
}
