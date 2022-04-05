package lecture4_stack_queue;

class Node {
    public Object data;
    public Node next;

    Node(Object data, Node next) {
	this.data = data;
	this.next = next;
    }

    Node(Object x) {
	this(x, null);
    }

}