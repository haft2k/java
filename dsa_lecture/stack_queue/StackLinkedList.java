package lecture4_stack_queue;

import java.util.EmptyStackException;

class StackLinkedList {
    protected Node head;

    StackLinkedList() {
	head = null;
    }

    boolean isEmpty() {
	return (head == null);
    }

    void push(Object x) {
	head = new Node(x, head);
    }

    Object top() throws EmptyStackException {
	if (isEmpty()) {
	    throw new EmptyStackException();
	}

	return (head.data);
    }

    Object pop() throws EmptyStackException {
	if (isEmpty()) {
	    throw new EmptyStackException();
	}
	Object x = head.data;
	head = head.next;
	return (x);
    }
}