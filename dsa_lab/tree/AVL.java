package tree;
/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */

class AVL {
    TreeNode rootNode;

    /**
     * a utility function to get the height of the tree
     *
     * @param TreeNode
     *
     * @return integer
     */
    int height(TreeNode node) {
	if (node == null) {
	    return 0;
	}

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
	return Math.max(treeLevel(node.getLeft()), treeLevel(node.getRight()));

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
     * node / b \ d
     *
     * @param TreeNode
     *
     * @return TreeNode
     */
    TreeNode rightRotation(TreeNode node) {
	TreeNode b = node.getLeft();
	TreeNode d = b.getRight();

	/* rotation */
	node.setLeft(d);
	b.setRight(node);

	/* update heights */
	node.height = treeLevel(node) + 1;
	b.height = treeLevel(b) + 1;

	/* return new root */
	return b;
    }

    /**
     * Left rotation technique Change TreeNode b become node, TreeNode a is
     * leftChild of b TreeNode d of leftChild TreeNode b change to rightChild of a
     * node \ b / d
     *
     * @param TreeNode
     *
     * @return TreeNode
     */
    TreeNode leftRotation(TreeNode node) {
	TreeNode b = node.getRight();
	TreeNode d = b.getLeft();

	/* rotation */
	node.setRight(d);
	b.setLeft(node);

	/* update heights */
	node.height = treeLevel(node) + 1;
	b.height = treeLevel(b) + 1;

	/* return new root */
	return b;
    }

    /**
     * 1. insert data to tree 2. update level tree 3. get balance after insert data
     *
     * @param integer
     *
     * @return TreeNode
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
	node.height = treeLevel(node) + 1;

	/* get balance factor */
	int balance = treeLevel(node);

	// if this node becomes unbalanced
	// Left Left
	if (balance > 1 && data < node.getLeft().getData()) {
	    return rightRotation(node);
	}

	// Right Right
	if (balance < -1 && data > node.getRight().getData()) {
	    return leftRotation(node);
	}

	// Left Right
	if (balance > 1 && data > node.getRi)
    }

    /**
     * Function convert BST to AVL tree
     *
     * @param a TreeNode
     *
     *          return TreeNode
     */
    TreeNode updateTree(TreeNode node) {
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
	    node.setLeft(updateTree(node.getLeft()));
	}

	if (node.getRight() != null) {
	    node.setRight(updateTree(node.getRight()));
	}

	return node;

    }

}
