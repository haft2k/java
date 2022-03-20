package lecture3;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int data) {
	DoublyLinkedNode newNode = new DoublyLinkedNode(data);
	newNode.setNextNode(newNode);

	if (this.head != null) {
	    this.head.setPrevNode(newNode);
	}

	this.head = newNode;
    }
}
