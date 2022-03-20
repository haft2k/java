package lecture3;

public class DoublyLinkedNode {
    private int data;
    private DoublyLinkedNode prevNode;
    private DoublyLinkedNode nextNode;

    public DoublyLinkedNode(int data) {
	this.data = data;
    }

    public int getData() {
	return data;
    }

    public void setData(int data) {
	this.data = data;
    }

    public DoublyLinkedNode getPrevNode() {
	return prevNode;
    }

    public void setPrevNode(DoublyLinkedNode prevNode) {
	this.prevNode = prevNode;
    }

    public DoublyLinkedNode getNextNode() {
	return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
	this.nextNode = nextNode;
    }

}
