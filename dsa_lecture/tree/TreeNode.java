package lecture6_tree;

class TreeNode {
    private int data;
    int height;
    private TreeNode right;
    private TreeNode left;

    /**
     * Constructor
     */
    TreeNode(int data) {
	this.data = data;
	right = left = null;
    }

    /**
     * Setter of right & left sub
     *
     */
    void setRight(TreeNode right) {
	this.right = right;
    }

    void setLeft(TreeNode left) {
	this.left = left;
    }

    /**
     * Getter of data, right, left
     *
     */
    TreeNode getRight() {
	return this.right;
    }

    TreeNode getLeft() {
	return this.left;
    }

    int getData() {
	return this.data;
    }

    /**
     * find node data
     *
     * @param data
     * @return TreeNode
     */
    TreeNode find(int data) {
	if (this.data == data) {
	    return this;
	}
	// left
	if (this.data < data && getLeft() != null) {
	    return left.find(data);
	}

	// right
	if (this.data > data && getRight() != null) {
	    return right.find(data);
	}

	return null;

    }

    /**
     * inset data
     *
     * @param integer
     *
     * @return TreeNode
     */
    void insert(int data) {

    }
}
