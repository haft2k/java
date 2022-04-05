package lecture3_linked_list;

 class LinkedList {
    // head of the list
    private Node head;

     void insertAtHead(int data) {
	Node newNode = new Node(data);
	newNode.setNextNode(this.head);
	this.head = newNode;
    }

     int length() {
	int length = 0;
	Node curreNode = this.head;

	while (curreNode != null) {
	    length++;
	    curreNode = curreNode.getNextNode();
	}
	return length;
    }

     void deleteFromHead() {
	this.head = head.getNextNode();
    }

     Node find(int data) {
	Node currentNode = this.head;

	while (currentNode != null) {
	    if (currentNode.getData() == data) {
		return currentNode;
	    }
	    currentNode = currentNode.getNextNode();
	}
	return null;
    }

    @Override
     public String toString() {
	String result = "";
	Node current = this.head;

	System.out.print("{");
	while (current != null) {
	    result += current.toString() + ", ";
	    current = current.getNextNode();
	}
	result += "}";
	return result;
    }
}