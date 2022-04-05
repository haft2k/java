package lecture6_tree;

class AVL {
    TreeNode node;
    /*
     * Constructor class AVL
     */
    AVL() {
	node = null;
    }

    /**
     * Calculator 1 + max compare left && right
     * @param TreeNode
     *
     * return height
     */
     int treeLevel(TreeNode node) {
	if (node == null) {return -1;}

	// update height of this ancestor TreeNode
	return 1 + Math.max(treeLevel(node.getLeft()),
		       treeLevel(node.getRight()));

    }

    /**
     * insert new node
     * @param TreeNode, integer
     * 
     */
    void insert(TreeNode node, int data) {
	if (node == null) {
	    node = new TreeNode(data);

	} else {
	    
	    if (data < node.getData()) {
		if (node.getRight() == null) {
		    node.setRight(new TreeNode(data));
		    
		} else {
		    node.setRight(insert(node.getRight(), data));
		}
		
	    } else {
		if (node.getLeft() == null) {
		    node.setLeft(new TreeNode(data));

		} else {
		    node.setLeft(insert(node.getLeft(), data));
		}
	    }
	    
		
	

    /**
     * function check Avl tree
     *
     * return boolean
     */
     boolean checkAvl(TreeNode TreeNode) {
	if (TreeNode == null) { return true; }

	if (Math.abs(treeLevel(TreeNode.getLeft()) - treeLevel(TreeNode.getRight())) > 1 ) {
	    return false;
	}

	return checkAvl(TreeNode.getLeft()) && checkAvl(TreeNode.getRight());

    }


    /**
     * Right rotation technique
     * Change TreeNode b become node, TreeNode a is rightChild of b
     * TreeNode d of rightChild TreeNode b, change to leftChild of a
     *
     * return new TreeNode like node
     */
     TreeNode rightRotation(TreeNode a) {
	TreeNode b = a.getLeft();
	TreeNode d = b.getRight();

	a.setLeft(d);
	b.setRight(a);

	return b;
    }


    /**
     * Left rotation technique
     * Change TreeNode b become node, TreeNode a is leftChild of b
     * TreeNode d of leftChild TreeNode b, change to rightChild of a
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
     * return TreeNode
     */
     TreeNode updateTreeAvl(TreeNode node) {
	// check height of node TreeNode
	// if node TreeNode > 1
	if (Math.abs(treeLevel(node.getLeft()) - treeLevel(node.getRight())) > 1) {

	    if (treeLevel(node.getLeft()) > treeLevel(node.getRight())) {
		TreeNode temp = node.getLeft();

		// if  left sub >= right sub
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








