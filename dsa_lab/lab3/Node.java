package lab3;

class Node {
    private int data;
    private Node nextNode;

    // Constructor
    Node(int data, Node newNode) {
	this.data = data;
	this.nextNode = newNode;
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

    Node getNextNode() {
	return nextNode;
    }

    void setNextNode(Node nextNode) {
	this.nextNode = nextNode;
    }

    @Override
    public String toString() {
	return "" + this.data;
    }
}
