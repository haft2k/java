package lab3;

class Node {
    private int data;
    private Node link;


    /**
     * Constructor parameter
     * set new node with data parameter
     *
     * @param data
     */
    Node(int data) {
	this.data = data;
	this.link = null;
    }

    // setter && getter of data && nextNode
    int getData() {
	return data;
    }

    void setData(int data) {
	this.data = data;
    }

    Node getLink() {
	return link;
    }

    void setLink(Node nextNode) {
	this.link = nextNode;
    }

    /**
     * @override toString()
     *
     * @return String
     */
    @Override
    public String toString() {
	return "" + this.data;
    }
}
