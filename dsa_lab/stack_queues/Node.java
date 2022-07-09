package stack_queues;

/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */

class Node {
    int data;
    Node link;

    /** Constructor parameter */
    Node(int data, Node next) {
	this.data = data;
	this.link = next;
    }

    Node(int x) {
	this(x, null);
    }



}
