package lab3;

class Node {
    private int data;
    private Node link;

    /**
     * Constructor parameter
     *
     * @param integer & Node
     */
    Node(int data, Node newNode) {
	this.data = data;
	this.link = newNode;
    }

    Node(int data) {
	this(data, null);
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
