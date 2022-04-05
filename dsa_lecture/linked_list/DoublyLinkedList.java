package lecture3_linked_list;

 class DoublyLinkedList {
    private DoublyLinkedNode head;

     void insertAtHead(int data) {
	DoublyLinkedNode newNode = new DoublyLinkedNode(data);
	newNode.setNextNode(newNode);

	if (this.head != null) {
	    this.head.setPrevNode(newNode);
	}

	this.head = newNode;
    }
}
