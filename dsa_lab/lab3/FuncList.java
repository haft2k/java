package lab3;

public class FuncList {
    Node headNode, tailsNode;

    public FuncList() {
	headNode = tailsNode = null;
    }

    // Node empty
    boolean isEmpty() {
	return (this.headNode == null);
    }

    // Clear Node
    void clear() {
	this.headNode = this.tailsNode = null;
    }

    // Insert at head list
    void insertAtHead(int data) {
	Node nextNode = new Node(data);
	nextNode.setNextNode(headNode);
	this.headNode = nextNode;
	this.tailsNode = nextNode;

    }

    void insertAtTail(int data) {
	Node nextNode = new Node(data);

	if (this.headNode == null) {
	    this.headNode = nextNode;
	    this.tailsNode = nextNode;
	}
	this.tailsNode.setNextNode(nextNode);
	this.tailsNode = nextNode;
    }

    // Insert multiple element at head list
    void insertMulti(int[] arr) {
	for (int i = arr.length - 1; i >= 0; i--) {
	    insertAtHead(arr[i]);
	}
    }

    void search(int value) {
	Node current = headNode;
	int i = 0;

	if (headNode == null) {
	    System.out.println("List empty");
	} else {
	    while (current != null) {
		if (current.getData() == value) {
		    break;
		}
		i++;
		current = current.getNextNode();
	    }
	    System.out.println("found index: " + i);
	}

    }

    // visit
    void visit(Node node) {
	System.out.print(node.getData() + " ");
    }

    // Visit multiple Node
    void traverse() {
	Node nextNode = headNode;

	while (nextNode != null) {
	    nextNode = nextNode.getNextNode();
	}
    }

    @Override
    public String toString() {
	String result = "";
	Node currentNode = this.headNode;
	System.out.print("{  ");

	while (currentNode != null) {
	    result += currentNode.toString() + "  ";
	    currentNode = currentNode.getNextNode();
	}
	result += "}";
	return result;
    }

}