package lecture6_tree;
//package lecture6;
//
//class BinarySearchTree {
//    private Node rootNode;
//
//    /**
//     * Delete with parameter data
//     * @param data
//     */
//    void delete(Integer data) {
//	Node current = this.rootNode;
//	Node parent = this.rootNode;
//	boolean isLeftChild = false;
//
//	// if rootNode is null
//	if (current == null) {
//	    return;
//	}
//
//	/**
//	 *
//	 * case 1: delete node leaf use loop iterative find data
//	 *
//	 */
//
//	while (current != null && current.getData() != data) {
//
//	    parent = current;
//	    if (data < current.getData()) {
//		current = current.getLeftChild();
//		isLeftChild = true;
//	    } else {
//		current = current.getRightChild();
//		isLeftChild = false;
//	    }
//	}
//
//	// end if current left || right next node is null
//	if (current == null) {
//	    return;
//	}
//
//	// if left && right no have data
//	// set nextNode to null
//	if (current.getLeftChild() == null && current.getRightChild() == null) {
//	    if (current == rootNode) {
//		rootNode = null;
//
//	    } else {
//		if (isLeftChild) {
//		    parent.setLeftChild(null);
//		} else {
//		    parent.setRightChild(null);
//		}
//	    }
//
//	    /**
//	     * case 2: deleted has one child
//	     */
//	} else if (current.getRightChild() == null) {
//	    if (current == rootNode) {
//		rootNode = current.getLeftChild();
//
//	    } else if (isLeftChild) {
//		parent.setLeftChild(current.getLeftChild());
//	    } else {
//		parent.setRightChild(current.getLeftChild());
//	    }
//
//	} else if (current.getLeftChild() == null) {
//	    if (current == rootNode) {
//		rootNode = current.getRightChild();
//	    } else if (isLeftChild) {
//		parent.setLeftChild(current.getRightChild());
//	    } else {
//		parent.setRightChild(current.getRightChild());
//	    }
//	}
//
//    }
//}
