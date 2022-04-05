package lecture6_tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("please enter number");
	int n = scan.nextInt();

	Node tree = null;
	for (int i=0; i<n; i++) {
	    tree.insert(tree, scan.nextInt());
	}

	while (!checkAvl(tree)) {
	    updateTreeAvl(tree);
	}

	System.out.println(treeLevel(tree));

    }
}
}
