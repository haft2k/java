class Node {
    int data;
    Node left, right;

    /* Constructor */
    Node(int data) {
	this.data = data;
	left = right = null;
    }

}

class BinaryTree {
    Node root;

    /* constructor */
    BinaryTree() {
	root = null;
    }

    /**
     * search node have greater than parameter
     * print node
     *
     * @param Node, integer
     *
     * @return
     *
     */
    void search(Node node, int data) {
	
