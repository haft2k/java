package BinaryTree;


public class Main {

	public static void main(String[] args) {
		TreeNode bst = new TreeNode();
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		bst.insert(40);
		bst.insert(30);
		bst.insert(35);
		bst.printTree(bst.root);
		bst.delete(10);
		System.out.println("");
		bst.printTree(bst.root);
	}
}

