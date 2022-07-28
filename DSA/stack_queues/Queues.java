/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. All rights reserved.
 * address: Viet Nam
 *
 * This software is the confidential and proprietary information of GumBox, Inc
 * ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with GumBox
 */
package stack_queues;
// import Blah, blah.....

/**
 * @version 1.00
 * @since July 09, 2022 GumBox Inc.
 * @author falc0n (https://www.github.com/haft2k)
 */

public class Queues {

    Node head, tail;

    /** Constructor default */
    public Queues() {
	this.head = this.tail = null;
    }

    /** add an data to the queue. */
    void enqueue(int data) {
	Node temp = new Node(data);
	if (head == null) {
	    head = temp;
	    return;
	}

	// add the new node at the end of queue and change tail
	tail.link = temp;
	this.tail = temp;
    }

    /** delete an data to the queue */
    Node dequeue() {
	// if queue is empty, return null
	if (head == null) {
	    return null;
	}

	// move head to next node is head
	Node temp = this.head;
	this.head = this.head.link;


	// if next node becomes NULL, change tail to NULL
	if (this.head == null) {
	    this.tail = null;
	}

	return temp;
    }

}


class QueueArray {

}
