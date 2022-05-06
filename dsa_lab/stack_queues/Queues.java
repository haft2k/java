/*
 * @version 1.0 April 21, 2022
 *
 * Copyright (c) April 21, 2022 - 20?? GumBox, Inc.
 * Address....................
 * All rights reserved.
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
 * Queues is linear structure non-primitive
 *
 * ruler: First in First out (FIFO) queues = null --> top = -1
 *
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github.com/hatd2k
 *
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
