package lab5;

/*
 * Stack is linear structure non-primitive
 *
 * ruler: Last in first out (LIFO)
 * stack = null --> top = -1
 *
 */
public class Stack {
    Node headNode;

    // Constructor
    Stack() {
	headNode = null;
    }

    // return headNode or not empty
    boolean isEmpty() {
	return (headNode == null);
    }

    // push 1 element to stack
    void push(int data) {
	headNode = new Node(data, headNode);
    }

    // pop 1 element to stack
    int pop() {
	int x = headNode.data;
	headNode = headNode.next;
	return x;
    }

    // method return Node
    // change integer to binary
    void convertToBinary(int data) {

	// Calculate data divide by 2
	while (data > 0) {
	    push(data % 2);
	    data = data / 2;
	}

	while (!isEmpty()) {
	    System.out.print(this.pop());
	}
    }

}
