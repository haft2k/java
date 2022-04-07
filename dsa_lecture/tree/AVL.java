package lecture6_tree;

class AVL {
    TreeNode root;
    /**
     * Constructor class AVL
     */
    AVL() {
    }

    /**
     * Calculator 1 + max compare left && right
     *
     * @param TreeNode
     *
     * return height
     */
    int treeLevel(TreeNode node) {
	if (node == null) {
	    return -1;
	}
	// update height of this ancestor TreeNode
	return 1 + Math.max(treeLevel(node.getLeft()), treeLevel(node.getRight()));

    }

    /**
     * insert 1 node to tree
     */
    void insert(int data) {
	TreeNode node = new TreeNode(data);

	if (root == null) {
	    root = new TreeNode(data);
	} else {
	    if (data < root.getData()) {
		if (root.getLeft() == null) {
		    root.setLeft(node);
		}
	    }
	}
    }

    /**
     * insert data
     *
     * @param treeNode && data
     *
     * return node
     */
    TreeNode insert(TreeNode node, int data) {

	if (node == null) {
	    node = new TreeNode(data);

	} else {

	    // if data < parent set left
	    // else set right

	    if (data < node.getData()) {
		if (node.getLeft() == null) {
		    node.setLeft(new TreeNode(data));
		} else {
		    node.setLeft(insert(node.getLeft(), data));
		}
	    } else {
		if (node.getRight() == null) {
		    node.setRight(new TreeNode(data));
		} else {
		    node.setRight(insert(node.getRight(), data));

		}
	    }

	}
	return node;
    }

    /**
     * function check Avl tree return boolean
     */
    boolean checkAvl(TreeNode node) {
	if (node == null) {
	    return true;
	}

	if (Math.abs(treeLevel(node.getLeft()) - treeLevel(node.getRight())) > 1) {
	    return false;
	}

	return checkAvl(node.getLeft()) && checkAvl(node.getRight());

    }

    /**
     * Right rotation technique Change TreeNode b become node, TreeNode a is
     * rightChild of b TreeNode d of rightChild TreeNode b, change to leftChild of a
     *
     * return new TreeNode like node
     */
    TreeNode rightRotation(TreeNode root) {
	TreeNode b = root.getLeft();
	TreeNode d = b.getRight();

	root.setLeft(d);
	b.setRight(root);

	return b;
    }

    /**
     * Left rotation technique Change TreeNode b become node, TreeNode a is
     * leftChild of b TreeNode d of leftChild TreeNode b
     * change to rightChild of a
     *
     * return new TreeNode like node
     */
    TreeNode leftRotation(TreeNode a) {
	TreeNode b = a.getRight();
	TreeNode d = b.getLeft();

	a.setRight(d);
	b.setLeft(a);
	return b;
    }

    /**
     * Function convert BST to AVL tree
     *
     * @param a TreeNode
     *
     * return TreeNode
     */
    TreeNode updateTreeAvl(TreeNode node) {
	// check height of node TreeNode
	// if node TreeNode > 1
	if (Math.abs(treeLevel(node.getLeft()) - treeLevel(node.getRight())) > 1) {

	    if (treeLevel(node.getLeft()) > treeLevel(node.getRight())) {
		TreeNode temp = node.getLeft();

		// if left sub >= right sub
		if (treeLevel(temp.getLeft()) >= treeLevel(temp.getRight())) {
		    node = rightRotation(node);

		}

		// else left sub < right sub
		else {
		    node.setLeft(leftRotation(node.getLeft()));
		    node = rightRotation(node);
		}
	    }

	    // else leftChild of node < rightChild of root
	    else {
		TreeNode temp = node.getRight();

		if (treeLevel(temp.getLeft()) <= treeLevel(temp.getRight())) {
		    node = leftRotation(node);
		} else {
		    temp.setRight(rightRotation(temp.getRight()));
		    temp = leftRotation(temp);
		}
	    }
	}

	if (node.getLeft() != null) {
	    node.setLeft(updateTreeAvl(node.getLeft()));
	}

	if (node.getRight() != null) {
	    node.setRight(updateTreeAvl(node.getRight()));
	}

	return node;

    }

    /**
     * A utility function to print preorder traversal
     */
    void preOrder(TreeNode node) {
	if (node != null) {
	    System.out.print(node.getData() + " ");
	    preOrder(node.getLeft());
	    preOrder(node.getRight());
	}
    }
}
