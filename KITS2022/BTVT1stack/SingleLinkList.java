
package BTVT1stack;


class Node {

	int data; //
	Node link;// tham chiếu đến phần tử tiếp theo

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

	public boolean isEmpty() {
		return head == null;
	}

	void insertAtHead(int x) {
		if (isEmpty()) {
			head = new Node(x);
		} else {
			head = new Node(x, head);
		}

	}

	int deleteFront() {
		if (isEmpty()) {
			return -1;
		}
		int x = head.data;
		head = head.link;
		return x;
	}

	void insertAtTail(int x) {
		if (isEmpty()) {
			head = new Node(x);
		} else {
			Node node = head;
			while (node.link != null) {
				node = node.link;
			}
			node.link = new Node(x);
		}
	}

	int deleteTail() {
		if (isEmpty()) {
			return -1;
		}
		// 5 ->10 ->20 ->30
		int x;
		Node node = head, el1 = head;
		while (node.link != null) {
			el1 = node;
			node = node.link;
		}
		x = node.data;
		if (head == node) {
			head = null;
		} else {
			el1.link = null;
		}
		return x;
	}

	void printAll() {
		Node node = head;
		if (node != null) {
			System.out.print(node.data);
			node = node.link;
		}
		while (node != null) {
			System.out.print(", " + node.data);
			node = node.link;
		}
	}
}


