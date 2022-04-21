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
package lab3;
// import blah blah .....

/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
 */
public class Main {

    public static void main(String[] args) {
	/* Call class */
	FuncList func = new FuncList();

	// set array int
	int[] arr = { 7, 2, 9, 8, 6, 3 };

	/* function list */
	func.insertMulti(arr); // { 7, 2, 9, 8, 6, 3 }
	func.insertAtHead(12); // { 12, 7, 2, 9, 8, 6, 3 }
	System.out.println(func.toString());

	func.search(3); // index 6

	// test method visit
	Node node = new Node(12);
	func.visit(node);

	func.traverse();

    }

}
