package lab4;

public class FuncList {
    Node headNode, tailNode;

    // Constructor
    FuncList() {
	headNode = tailNode = null;
    }

    void clear() {
	headNode = tailNode = null;
    }

    boolean isEmpty() {
	return (headNode == null);
    }

    // add person
    void addHead(Person data) {
	Node nextNode = new Node(data);
	nextNode.setNextNode(headNode);
	this.headNode = this.tailNode = nextNode;
    }

    void addTail(Person data) {
	Node nextNode = new Node(data);

	if (this.headNode == null) {
	    this.headNode = nextNode;
	    this.tailNode = nextNode;
	}
	this.tailNode.setNextNode(nextNode);
	this.tailNode = nextNode;
    }

    // add multiple person with array String name, Integers age
    void addMulti(String[] name, int[] age) {
	Person data;

	for (int i = 0; i < name.length; i++) {
	    data = new Person(name[i], age[i]);
	    addTail(data);
	}

    }
    void swapNode(Node currentNode, Node indexNode) {
	Person temp = currentNode.getData();
	currentNode.setData(indexNode.getData());
	indexNode.setData(temp);

    }

    void sortByName() {
	Node currentNode = headNode;
	Node indexNode = null;

	if (headNode == null) {
	    return;
	} else {
	     while (currentNode != null) {
		indexNode = currentNode.getNextNode();

		while (indexNode != null) {

		    if ((currentNode.getData().name).compareTo(indexNode.getData().name) > 0) {
			swapNode(currentNode, indexNode);
		    }

		    indexNode = indexNode.getNextNode();
		}
		currentNode = currentNode.getNextNode();
	    }
	}
    }

    // visit
    void visit(Node node) {
	System.out.print(node.getData() + "\n");
    }

    // Visit multiple Node
    void traverse() {
	Node nextNode = headNode;

	while (nextNode != null) {
	    visit(nextNode);
	    nextNode = nextNode.getNextNode();
	}
    }

    @Override
    public String toString() {
	String result = "";
	Node currentNode = this.headNode;
	System.out.println();

	while (currentNode != null) {
	    result += currentNode.toString() + " \n";
	    currentNode = currentNode.getNextNode();
	}
	result += "";
	return result;
    }
}
