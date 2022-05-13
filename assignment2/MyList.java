package assignment2;

class MyList<T> {
    // headNode default is null
    Node<T> headNode;
    // tailNode default is null
    Node<T> tailNode;

    // Constructor default
    MyList() {
	this.headNode = null;
	this.tailNode = null;
    }

    // Constructor with headNode and tailNode
    MyList(Node<T> head, Node<T> tail) {
	this.headNode = head;
	this.tailNode = tail;
    }

    /**
     * Checking if this list is empty
     *
     * @return true if list is empty
     */

    boolean isEmpty() {
	return (headNode == null);
    }

    /**
     * Returning the length of this list
     *
     * @return The length of this list
     */

    int length() {
	Node<T> tempNode = this.headNode;
	int count = 0;

	// linear search O(n)
	// get next node && count Node
	while (tempNode != null) {
	    tempNode = tempNode.getNextNode();
	    count++;
	}
	return count;
    }

    /**
     * Insert an item to the head of this list
     *
     * @param item The item to be inserted
     */

    void insertToHead(T item) {
	Node<T> new_node = new Node<T>(item);

	if (isEmpty()) {
	    this.tailNode = new_node;
	    this.headNode = new_node;
	}

	// make new_node as head
	// Move the head to point to new Node
	new_node.setNextNode(headNode);
	this.headNode = new_node;

    }

    /**
     * Insert an item to the last of this list
     *
     * @param item the item to be insterd
     */

    void insertToTail(T item) {
	Node<T> new_node = new Node<T>(item);

	// if linked list empty
	// make new_node as headNode & tailNode
	if (isEmpty()) {
	    this.headNode = new_node;
	    this.tailNode = new_node;
	    return;
	}

	new_node.setNextNode(null);

	tailNode = headNode;
	while (tailNode.getNextNode() != null) {
	    tailNode = tailNode.getNextNode();
	}

	// set tailNode next node is new_node
	tailNode.setNextNode(new_node);
	return;
    }

    /**
     * Insert an item at position to this list
     *
     * @param position The position of new item
     *
     * @param item     The item to be inserted
     */

    void insertAfterPosition(int position, T item) {
	Node<T> new_node = new Node<T>(item);
	Node<T> tempNodeNode = headNode;
	int count = 0;

	// check position valid
	if (position < 1) {
	    System.out.println("Invalid position");
	}

	// position is first ==> headNode is new_node
	if (position == 1) {
	    new_node.setNextNode(this.headNode);
	    this.headNode = new_node;
	    this.tailNode = new_node;
	} else {

	    // linear search position
	    while (tempNodeNode != null && count != position) {
		tempNodeNode = tempNodeNode.getNextNode();
		count++;
	    }

	    // change link node previous position to new_node
	    // new_node link to nextNode
	    new_node.setNextNode(tempNodeNode.getNextNode());
	    tempNodeNode.setNextNode(new_node);

	}
    }

    /**
     *
     * Deleting the tail of this list
     *
     */

    void deleteTail() {
	if (this.headNode == null) {
	    System.out.println("List empty");
	} else {

	    // find the second last Node
	    if (this.headNode != this.tailNode) {
		Node<T> tempNodeNode = this.headNode;

		// find last node is tail
		// tempNode
		while (tempNodeNode.getNextNode().getNextNode() != null) {
		    tempNodeNode = tempNodeNode.getNextNode();
		}

		// second last item, become new tail
		tempNodeNode.setNextNode(null);
		this.tailNode = tempNodeNode;

	    } else {
		this.headNode = this.tailNode = null;
	    }
	}
    }

    /**
     * Searching and deleting an item from this list by comparing the ID of items
     *
     * @param item The item to be deleted
     */

    // 1. Find the previous node of the node to be deleted.
    // 2. Change the next of the previous node.
    // 3. Free memory for the node to be deleted.
    void deleteElement(T item) {
	Node<T> tempNode = this.headNode;
	Node<T> prevNode = null;

	// if headNode hold the item to be deleted
	if (tempNode != null && tempNode.getInfo() == item) {
	    this.headNode = tempNode.getNextNode(); // change head node
	    return;
	}

	// search item to be deleted
	while (tempNode != null && tempNode.getInfo() != item) {
	    prevNode = tempNode;
	    tempNode = tempNode.getNextNode();
	}

	// unlink the node tempNode
	prevNode.setNextNode(tempNode.getNextNode());

	// set tail node
	if (prevNode.getNextNode() == null) {
	    tailNode = prevNode;
	}

    }


    /**
     * print list
     *
     */
    void traverse() {
	Node<T> temp = headNode;
	System.out.println("id | title | quantity | price");
	System.out.println("-----------------------------");
	while (temp != null) {
	    System.out.println(temp.getInfo());
	    temp = temp.getNextNode();
	}
    }

}
