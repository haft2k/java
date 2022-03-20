//package lecture6;
//
//class Node {
//    private Integer data;
//    private Node leftChild;
//    private Node rightChild;
//    private boolean isDeleted = false;
//
//    /**
//     * Constructor Node
//     *
//     * @param data
//     */
//    public Node(Integer data) {
//	this.data = data;
//    }
//
//    // Setter
//    // Getter
//
//    Integer getData() {
//	return data;
//    }
//
//    Node getLeftChild() {
//	return leftChild;
//    }
//
//    void setLeftChild(Node leftChild) {
//	this.leftChild = leftChild;
//    }
//
//    Node getRightChild() {
//	return rightChild;
//    }
//
//    void setRightChild(Node rightChild) {
//	this.rightChild = rightChild;
//    }
//
//
//    /**
//     * Search data in binary search tree
//     *
//     * @param data
//     * @return
//     */
//    Node find(Node rootNode, int data) {
//	if (rootNode != null) {
//
//	    if (rootNode.data == data) {
//		return rootNode;
//	    }
//
//	    if (data < rootNode.data && leftChild != null) {
//		return find(rootNode.leftChild, data);
//	    }
//
//	    if (rightChild != null) {
//		return find(rootNode.rightChild, data);
//	    }
//	}
//
//	return null;
//    }
//
//    /**
//     * Insert Data leftChild smallest ---- rightChild largest
//     *
//     * @param data
//     */
//    void insert(Node rootNode, int data) {
//	if (rootNode == null) {
//	    rootNode = new Node(data);
//	} else {
//	    if (data > rootNode.data) {
//		// if rightChild of rootNode
//		if (rootNode.rightChild == null) {
//		    rootNode.rightChild = new Node(data);
//		} else {
//		    rootNode.rightChild.insert(rootNode, data);
//		}
//
//		// else leftChild of rootNode
//	    } else {
//		if (rootNode.leftChild == null) {
//		    rootNode.leftChild = new Node(data);
//		} else {
//		    rootNode.leftChild.insert(rootNode, data);
//		}
//	    }
//	}
//
//    }
//
//    /**
//     * Find largest
//     */
//    Integer largest(Node rootNode) {
//	if (rootNode == null) {
//	    return largest(rootNode);
//	}
//	return null;
//    }
//
//    /**
//     * Find smallest
//     */
//    Integer smallest(Node rootNode) {
//	if (rootNode == null) {
//	    return smallest(rootNode);
//	}
//	return null;
//    }
//
//}
