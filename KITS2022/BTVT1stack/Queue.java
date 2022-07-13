package BTVT1stack;


public class Queue extends SLL {
	
	void enQueue(int data) {
		insertAtTail(data);
	}
	
	int deQueue() {
		return deleteFront();
	}
	
	@Override
	void printAll() {
		Node node = head;
		
		if (node != null) {
			System.out.print(node.data);
			node = node.link;
		}
		
		while (node != null) {
			System.out.print(", " + deleteTail());
			node = node.link;
		}
	}
}
