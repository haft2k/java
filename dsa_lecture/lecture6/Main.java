package lecture6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("please enter number");
	int n = scan.nextInt();

	TreeNode TreeNode = null;
	for (int i=0; i<n; i++) {
	    insert(TreeNode, scan.nextInt());
	}

	while (!checkAvl(TreeNode)) {
	    updateTreeAvl(TreeNode);
	}

	System.out.println(treeLevel(TreeNode));

    }
}
}
