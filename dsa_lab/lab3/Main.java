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
package lab3;
/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */

//import <name>

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
