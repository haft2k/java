package tree;

/**
 * @version 1.00 April 25, 2022 GumBox, Inc
 * @author github.com/haftd2k
 *
 */
class TreeNode {
    private TreeNode right;
    private TreeNode left;

    private int data;
    int height;
    private boolean isDeleted = false;

    /**
     * Constructor
     */
    TreeNode(int data) {
	this.data = data;
	right = left = null;
	height = 1;
    }

    /**
     * Setter of right && left sub
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
     * mark node delete
     *
     */
    void isDeleted() {
	this.isDeleted = true;
    }

    /**
     * find node data
     *
     * @param data
     *
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
     * insert new data
     * compare data with root node
     * left smaller than root
     * right largest than root
     *
     * @param integer
     *
     * @return TreeNode
     */
    void insert(int data) {
	/* right */
	// use recursion find leaf right for new data
	if (this.data >= data) {

	    if (this.getRight() == null) {
		this.setRight(new TreeNode(data));
	    } else {
		this.right.insert(data);
	    }

	    /* left */
	    // use recursion find leaf left for new data
	} else {
	    if (this.getLeft() == null) {
		this.setLeft(new TreeNode(data));
	    } else {
		this.left.insert(data);
	    }
	}
    }


}
