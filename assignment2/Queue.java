package assignment2;

/**
 * Queue is linear structure non-primitive
 *
 * ruler: First in First out (FIFO)
 *
 * Queue empty front = -1
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
	return (headNode == null);
    }

    /**
     *  method enqueue add item to
     **/
    void enQueue(T item) {
	Node<T> temp = new Node<T>(item);

	if (isEmpty()) {
	    headNode = tailNode = temp;
	    return;
	}

	tailNode.setNextNode(temp);
	tailNode = temp;
    }

    /**
     * Dequeue delete item head
     **/
    public T deQueue() {
	T item = headNode.getInfo();

	// check empty list
	if (isEmpty()) {
	    System.out.println("queue is empty");
	    return null;
	}

	// list have 1 item
	if (headNode == tailNode) {
	    headNode = tailNode = null;
	}

	// change headNode to next node
	headNode = headNode.getNextNode();
	return item;
    }



}
