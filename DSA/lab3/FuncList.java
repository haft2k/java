package lab3;

public class FuncList {
    Node head, tail;

    /** Constructor default */
    public FuncList() {
	head = tail = null;
    }

    /** Insert at head list */
    void insertAtHead(int data) {
	Node nextNode = new Node(data);

	nextNode.setLink(head);

	this.head = nextNode;

    }

    /** insert data at tail */
    void insertAtTail(int data) {
	Node nextNode = new Node(data);

	if (this.head == null) {
	    this.head = nextNode;
	    this.tail = nextNode;

	    // end task
	    return;
	}

	this.tail.setLink(nextNode);
	this.tail = nextNode;
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
	Node current = head;
	int i = -1;

	if (head == null) {
	    System.out.println("List empty");
	} else {
	    while (current != null) {
		if (current.getData() == value) {
		    break;
		}

		current = current.getLink();
		i++;
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
	Node nextNode = head;

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
	Node currentNode = this.head;
	System.out.print("{  ");

	while (currentNode != null) {
	    result += currentNode.toString() + "  ";
	    currentNode = currentNode.getLink();
	}
	result += "}";
	return result;
    }

}
