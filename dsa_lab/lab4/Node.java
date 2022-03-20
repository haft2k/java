
package lab4;

public class Node {
    private Person data;
    private Node nextNode;

    // Constructor
    Node(Person data) {
	this(data, null);
    }

    Node(Person data, Node nextNode) {
	this.data = data;
	this.nextNode = nextNode;
    }

    // getter && setter nextNode
    public Node getNextNode() {
	return nextNode;
    }

    public void setNextNode(Node nextNode) {
	this.nextNode = nextNode;
    }

    // getter && setter data
    public Person getData() {
	return data;
    }

    public void setData(Person data) {
	this.data = data;
    }


    @Override
    public String toString() {
	return "" + this.data;
    }
}
