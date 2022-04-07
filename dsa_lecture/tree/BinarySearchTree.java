package lecture6_tree;

class BinarySearchTree {
    private TreeNode rootNode;

    /**
     * find node data
     *
     * @param data
     * @return TreeNode
     */
    TreeNode find(int data) {

	if (rootNode != null) {
	    return rootNode.find(data);
	}

	return null;
    }

    /**
     * Delete with parameter data
     *
     * @param data
     */
    void delete(Integer data) {
	TreeNode current = this.rootNode;
	TreeNode parent = this.rootNode;
	boolean isLeftChild = false;

	// if rootNode is null
	if (current == null) {
	    return;
	}

	/**
	 *
	 * case 1: delete node leaf use loop iterative find data
	 *
	 */

	while (current != null && current.getData() != data) {

	    parent = current;
	    if (data < current.getData()) {
		current = current.getLeft();
		isLeftChild = true;
	    } else {
		current = current.getRight();
		isLeftChild = false;
	    }
	}

	// end if current left || right next node is null
	if (current == null) {
	    return;
	}

	// if left && right no have data
	// set nextNode to null
	if (current.getLeft() == null && current.getRight() == null) {
	    if (current == rootNode) {
		rootNode = null;

	    } else {
		if (isLeftChild) {
		    parent.setLeft(null);
		} else {
		    parent.setRight(null);
		}
	    }

	    /**
	     * case 2: deleted has one child
	     */
	} else if (current.getRight() == null) {
	    if (current == rootNode) {
		rootNode = current.getLeft();

	    } else if (isLeftChild) {
		parent.setLeft(current.getLeft());
	    } else {
		parent.setRight(current.getLeft());
	    }

	} else if (current.getLeft() == null) {
	    if (current == rootNode) {
		rootNode = current.getRight();
	    } else if (isLeftChild) {
		parent.setLeft(current.getRight());
	    } else {
		parent.setRight(current.getRight());
	    }
	}

    }
}
