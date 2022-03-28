package lecture3_linked_list;

class Node {
     int data;
    private Node nextNode;

    // Constructor to create a new node
    // Next is by default initialized
    // as null

     Node(int data) {
	this.data = data;
    }

     int getData() {
	return data;
    }

     void setData(int data) {
	this.data = data;
    }

     Node getNextNode() {
	return nextNode;
    }

     void setNextNode(Node nextNode) {
	this.nextNode = nextNode;
    }

    @Override
    public String toString() {
	return "Data: " + this.data;
    }
}