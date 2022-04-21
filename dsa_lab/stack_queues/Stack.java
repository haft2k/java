
package stack_queues;

/**
 * Stack is linear structure non-primitive
 *
 * ruler: Last in first out (LIFO) stack = null --> top = -1
 *
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 */
public class Stack {
    Node headNode;

    /** Constructor default */
    Stack() {
	headNode = null;
    }

    /**
     * push 1 element to stack head to the element
     *
     * @param integer
     */
    void push(int data) {
	// create new node data
	Node newNode = new Node(data);

	// put headNode reference into temp link
	newNode.link = headNode;

	// update headNode reference
	headNode = newNode;
    }

    /**
     * pop 1 element to stack
     *
     * @return integer
     */
    int pop() {
	int x = headNode.data;
	headNode = headNode.link;
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
