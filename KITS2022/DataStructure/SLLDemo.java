package DataStructure;


class Node {

	int data;
	Node link;

	Node(int x) {
		data = x;
		link = null;
	}

	Node(int x, Node node) {
		data = x;
		link = node;
	}
}

class SLL {

	Node head;

	SLL() {
		head = null;
	}


	void insertAtFront(int x) {
		if (isEmpty()) {
			head = new Node(x);
		} else {
			head = new Node(x, head);
		}

	}

	void printALL() {
		Node node = head;
		if (node != null) {
			System.out.print(node.data);
			node = node.link;
		}
		while (node != null) {
			System.out.print(", " + node.data);
			node = node.link;
		}
		System.out.println();
	}

	void printLast() {
		Node node = head;

		while (node != null) {
			node = node.link;
			if (node.link == null) {
				System.out.println(node.data);
				break;
			}
		}
	}

	void deleteLast() {
		Node node = head;

		while (node.link.link != null) {
			node = node.link;
		}
		node.link = null;
		System.out.println(node.data);
	}
	
	
	
	boolean isEmpty() {
		return head == null;
	}
}

public class SLLDemo {

	public static void main(String[] args) {
		SLL sll = new SLL();
		sll.printALL();
		sll.insertAtFront(5);
		sll.insertAtFront(10);
		sll.insertAtFront(101);
		sll.insertAtFront(102);
		sll.insertAtFront(130);
		sll.insertAtFront(104);
		sll.insertAtFront(120);
		sll.insertAtFront(110);
		sll.insertAtFront(104);
		sll.insertAtFront(130);
		sll.insertAtFront(10);

		sll.printLast();
		sll.printALL();
		sll.deleteLast();
	}
}