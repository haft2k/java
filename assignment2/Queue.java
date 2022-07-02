package assignment2;

/**
 * Queue is linear structure non-primitive
 *
 * ruler: First in First out (FIFO)
 *
 * Queue empty front = -1
 *
 * @version 1.00 April 25, 2022 GumBox, Inc
 * @author github.com/haftd2k
 *
 */
 **/
public class Queue<T> {
    // front node in the queue
    Node<T> headNode;

    // rear node in the queue
    Node<T> tailNode;

    // constructor default
    Queue() {
	headNode = tailNode = null;
    }

    // check empty list
    boolean isEmpty() {
	return (this.headNode == null);
    }

    /**
     * method enqueue add item to
     **/
    void enQueue(T item) {
	Node<T> temp = new Node<T>(item);

	if (isEmpty()) {
	    this.headNode = this.tailNode = temp;
	    return;
	}

	this.tailNode.setNextNode(temp);
	this.tailNode = temp;
    }

    /**
     * Dequeue delete item head
     * @return
     **/
    T deQueue() {

	// check empty list
	if (isEmpty()) {
	    System.out.println("queue is empty");
	    return null;
	}

	// Store previous front and move front one node ahead
	Node<T> item = this.headNode;
	this.headNode = this.headNode.getNextNode();

	// If front becomes NULL, then change rear also as NULL
	if (this.headNode == null) {
	    this.tailNode = null;
	}

	return item.getInfo();
    }

    /**
     * printQueue First in First out
     */
    void printQueue(Queue<T> queue) {
	if (isEmpty()) {
	    return;
	}

	Node head = headNode;

	while (head != null) {
	    System.out.println(head.getInfo());
	    head = head.getNextNode();
	}

    }

}
