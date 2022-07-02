
package stack_queues;

/**
 * Stack is linear structure non-primitive
 *
 * ruler: Last in first out (LIFO) stack = null --> top = -1
 *
 * @version 1.00 April 25, 2022 GumBox, Inc
 * @author github.com/haftd2k
 *
 */
public class Stack {
    Node head;

    /** Constructor default */
    Stack() {
	head = null;
    }

    /**
     * push 1 element to stack head to the element
     *
     * @param integer
     */
    void push(int data) {
	// create new node data
	Node newNode = new Node(data);

	// put head reference into template link
	newNode.link = head;

	// update head reference
	head = newNode;
    }

    /**
     * pop 1 element to stack
     *
     * @return integer
     */
    int pop() {
	// check for stack underflow
	if (head == null) {
	    return -1;
	}

	int x = head.data;
	head = head.link;

	return x;
    }

    /**
    *
    * Convert a decimal to of binary. Example: input i = 18 --> 10001
    *
    * @param num Input decimal number
    *
    * @return binary numbers
    *
    */
   int[] convertToBinary(int num) {
	int[] arr = new int[100000];
	int count = 0;

	/*
	 * calculate decimal to binary count original value before being incremented
	 *
	 */
	while (num > 0) {
	    int binary = num % 2;
	    arr[count++] = binary;
	    num /= 2;

	}

	// print index last to first
	for (int i = count - 1; i >= 0; i--) {
	    System.out.print(arr[i]);
	}
	System.out.println();

	return arr;
   }

}
