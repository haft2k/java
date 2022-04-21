package stack_queues;

/**
 * Class Node use for Stack and Queues
 * Use Default Access Modifier
 *
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
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
