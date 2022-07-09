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
/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */

 //import <name>
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
