package lab5;

class Node {
    public int data;
    public Node next;

    Node(int data, Node next) {
	this.data = data;
	this.next = next;
    }

    Node(int x) {
	this(x, null);
    }

}