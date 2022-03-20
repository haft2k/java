package assignment2;

class Node<T> {
    private T info;
    private Node<T> nextNode;

    // Default constructor
    Node() {
    }

    Node(T info) {
	this.info = info;
	this.nextNode = null;
    }

    /**
     *
     * Constructor with info and next nextNode
     *
     * @param info The info of this nextNode
     *
     * @param next The next Node of this nextNode
     *
     */

    Node(T info, Node<T> nextNode) {
	this.info = info;
	this.nextNode = nextNode;
    }

    // getter && setter
    T getInfo() {
	return info;
    }

    void setInfo(T data) {
	this.info = data;
    }

    Node<T> getNextNode() {
	return nextNode;
    }

    void setNextNode(Node<T> node) {
	this.nextNode = node;
    }

    //Overriding to convert this nextNode to String
    @Override
    public String toString() {
	return this.info + " ";
    }
}
