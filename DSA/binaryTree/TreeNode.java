package BinaryTree;


class Node {

	int data;
	Node left, right;

	Node(int x) {
		this.data = x;
		left = right = null;
	}
}

class TreeNode {

	Node root;

	public TreeNode() {
		root = null;
	}

	boolean isEmpty() {
		return root == null;
	}

	void insert(int x) {
		if (isEmpty()) {
			root = new Node(x);
			return;
		}
		Node node = root, parent = null;
		while (node != null) {
			if (node.data == x) {
				System.out.println(x + " đã có");
				return;
			}
			parent = node;
			if (node.data > x)
				node = node.left;
			else
				node = node.right;
		}
		if (parent.data > x)
			parent.left = new Node(x);
		else
			parent.right = new Node(x);

	}

	Node node(int x) {
		Node nd = root;
		while (nd != null && nd.data != x)
			if (nd.data > x)
				nd = nd.left;
			else
				nd = nd.right;
		return nd; // nd==null?
	}

	boolean delete(int x) { // xóa giá trị x
		Node node = root, parentX = null;
		while (node != null && node.data != x) {
			parentX = node;
			if (node.data > x)
				node = node.left;
			else
				node = node.right;
		}
		if (node == null)
			return false;
		if (node.left == null || node.right == null) { // case 1,2.
			if (parentX == null) {
				root = root.right;
				if (root.left != null)
					root = root.left;
			} else if (parentX.data < x) {
				parentX.right = node.right;
				if (node.left != null)
					parentX.right = node.left;
			} else {
				parentX.left = node.right;
				if (node.left != null)
					parentX.left = node.left;
			}
		} else {// case 2 con !=null
			Node rootOfRight = node.right, leftMost = node.right, parent = null;
			while (leftMost.left != null) {
				parent = leftMost;
				leftMost = leftMost.left;
			}
			node.data = leftMost.data;
			if (parent == null) {
				node.right = leftMost.right;
			} else {
				parent.left = leftMost.right;
			}
		}
		return true;
	}

	void printTree(Node node) {
		if (node == null) {
			return;
		}
		printTree(node.left);
		System.out.print(node.data + " ");
		printTree(node.right);
	}
}
