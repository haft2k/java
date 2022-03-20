package lecture3;

public class DoublyEndedList {
    private Node headNode;
    private Node tail;

    public void insertAtTail(int data) {

	Node newNode = new Node(data);

	if (this.headNode == null) {
	    this.headNode = newNode;
	    this.tail = newNode;
	}
	this.tail.setNextNode(newNode);
	this.tail = newNode;
    }

    public void insertSorted(Node newNode) {
	Node current;

	if (headNode == null || headNode.getData() >= newNode.getData()) {
	    newNode = headNode;
	    headNode = newNode;
	} else {
	    current = headNode;

	    while (current.getNextNode() != null && current.getNextNode().getData() < newNode.getData()) {
		current = current.getNextNode();
		newNode = current.getNextNode();
	    }
	}
    }

    @Override
    public String toString() {
	String result = "{";
	Node currentNode = this.headNode;

	while (currentNode != null) {
	    result += currentNode.toString() + ", ";
	    currentNode = currentNode.getNextNode();
	}
	result += "}";
	return result;
    }
}
