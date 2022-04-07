package lecture6_tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	AVL tree = new AVL();
	Scanner scan = new Scanner(System.in);

	System.out.print("n = ");
	int n = scan.nextInt();

	System.out.println();
	int[] a = new int[n];

	for (int i=0; i<n; i++) {
	    a[i] = scan.nextInt();
	}


    }
}
