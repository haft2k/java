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
}





