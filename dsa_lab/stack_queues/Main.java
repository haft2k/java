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

/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
 */
public class Main {
    public static void main(String[] args) {
	Stack tStack = new Stack();
	int a = 12;
	tStack.convertToBinary(a);
	System.out.println();

	// test function
	// converToBinary(int a)
	System.out.print(Integer.toBinaryString(a));
    }
}
