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
package lab4;
// import blah blah .....

/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github.com/hatd2k
 *
 */
public class Main {
    public static void main(String[] args) {
	FuncList list = new FuncList();
	String[] name = { "HOA", "HA", "LAN", "NOI", "MUA", "NAY" };
	int[] age = { 25, 17, 26, 19, 23, 21 };

	list.addMulti(name, age);
	list.traverse();

	list.sortByName();
	System.out.println();
	list.traverse();
    }


}
