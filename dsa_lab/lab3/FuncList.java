package lab3;

public class FuncList {
    Node headNode, tailsNode;

    /** Constructor default */
    public FuncList() {
	headNode = tailsNode = null;
    }

    /** Insert at head list */
    void insertAtHead(int data) {
	Node nextNode = new Node(data);

	nextNode.setLink(headNode);

	this.headNode = nextNode;
	this.tailsNode = nextNode;

    }

    /** insert data at tail */
    void insertAtTail(int data) {
	Node nextNode = new Node(data);

	if (this.headNode == null) {
	    this.headNode = nextNode;
	    this.tailsNode = nextNode;
	}

	this.tailsNode.setLink(nextNode);
	this.tailsNode = nextNode;
    }

    /** Insert multiple element at head list */
    void insertMulti(int[] arr) {
	for (int i = arr.length - 1; i >= 0; i--) {
	    insertAtHead(arr[i]);
	}
    }

    /**
     * linear search value
     * next node if data not equal value search
     *
     * @param integer
     */
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
		current = current.getLink();
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
	    nextNode = nextNode.getLink();
	}
    }

    /**
     * @override toString()
     *
     * @return String
     */
    @Override
    public String toString() {
	String result = "";
	Node currentNode = this.headNode;
	System.out.print("{  ");

	while (currentNode != null) {
	    result += currentNode.toString() + "  ";
	    currentNode = currentNode.getLink();
	}
	result += "}";
	return result;
    }

}
