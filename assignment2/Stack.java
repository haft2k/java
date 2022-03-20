package assignment2;

/**
 * Stack is linear structure non-primitive
 *
 * ruler: Last in First out (LIFO) stack = null --> top = -1
 *
 **/

class Stack<T> {
    Node<T> headNode;

    Stack() {
	headNode = null;
    }

    // check stack empty or not
    boolean isEmpty() {
	return (headNode == null);
    }

    /**
     * push one Node to stack set headNode first data
     **/

    void push(T info) {
	headNode = new Node<T>(info, headNode);
    }

    /**
     * pop() delete 1 head node in Stack change headNode to previous Node return
     * data delete
     **/

    T pop() {
	// check empty list
	if (isEmpty()) {
	    return null;
	}

	T temp = headNode.getInfo();
	// change position headNode to next Node
	headNode = headNode.getNextNode();
	return temp;

    }
}
