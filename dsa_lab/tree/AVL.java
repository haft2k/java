package lecture6_tree;

class AVL {
    TreeNode rootNode;
    /**
     * Constructor class AVL
     */
    AVL() {
    }

    /**
     * a utility function to get the height of the tree
     *
     * @param TreeNode
     *
     * @return integer
     */
    int height(TreeNode node) {
	if (node == null) { return 0; }

	return node.height;
    }
    
    /**
     * Calculator 1 + max compare left && right
     *
     * @param TreeNode
     *
     * @return height
     */
    int treeLevel(TreeNode node) {
	if (node == null) {
	    return -1;
	}
	// update height of this ancestor TreeNode
	return 1 + Math.max(treeLevel(node.getLeft()), treeLevel(node.getRight()));

    }

    /**
     * use calculator height check AVL balance
     * 
     * @param TreeNode
     *
     * @return boolean
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
     * @param TreeNode
     *
     * @return 
     */
    TreeNode rightRotation(TreeNode node) {
	TreeNode b = node.getLeft();
	TreeNode d = b.getRight();

	node.setLeft(d);
	b.setRight(node);

	/* update heights */
	node.height = 

	
	return b;
    }

    /**
     * Left rotation technique Change TreeNode b become node, TreeNode a is
     * leftChild of b TreeNode d of leftChild TreeNode b
     * change to rightChild of a
     *
     * return new TreeNode like node
     */
    TreeNode leftRotation(TreeNode node) {
	TreeNode b = node.getRight();
	TreeNode d = b.getLeft();

	node.setRight(d);
	b.setLeft(node);

	/* update heights */
	
	return b;
    }

    /**
     * 1. insert data to tree
     * 2. update level tree
     * 3. get balance after insert data
     *
     * @param integer
     *
     * @return node
     */
    TreeNode insert(TreeNode node, int data) {

	/* insert data normal BST */
	if (node == null) {
	    node = new TreeNode(data);

	} else {

	    // if data < parent set to left
	    // else set to right
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

	/* update height */
	node.height = treeLevel(node);

	/* get balance factor */
	
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

    
}
