package BTVT1stack;


public class Stack extends SLL {
	
	
	void push(int data) {
		insertAtHead(data);
	}
	
	
	int pop() {
		return deleteTail();
	}
	
	
	
}
