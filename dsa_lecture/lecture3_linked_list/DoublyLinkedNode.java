package lecture3_linked_list;

 class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode prevNode;
    private DoublyLinkedNode nextNode;

     DoublyLinkedNode(int data) {
	this.data = data;
    }

     int getData() {
	return data;
    }

     void setData(int data) {
	this.data = data;
    }

     DoublyLinkedNode getPrevNode() {
	return prevNode;
    }

     void setPrevNode(DoublyLinkedNode prevNode) {
	this.prevNode = prevNode;
    }

     DoublyLinkedNode getNextNode() {
	return nextNode;
    }

     void setNextNode(DoublyLinkedNode nextNode) {
	this.nextNode = nextNode;
    }

}
