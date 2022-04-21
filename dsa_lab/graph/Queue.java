package graph;

import java.util.LinkedList;

class Queue {
    LinkedList<Integer> t;

    /**
     *  constructor
     */
    Queue() {
	t = new LinkedList<Integer>();
    }

    /**
     * check empty
     *
     * return boolean
     */
    boolean isEmpty() { return t.isEmpty(); }

    /**
     * input node enqueue tail to head
     *
     * @param integer
     */
    void enqueue(int x) {
	t.add(x);
    }

    /**
     * delete node head
     *
     * @return integer
     */
    int dequeue() {
	return (t.removeFirst());
    }
}
