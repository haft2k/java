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
package graph;
// import blah blah .....

/**
 * @version 1.00 April 21, 2022 GumBox, Inc
 * @author github: tdh2000
 *
 */

public class Main {

    /**
     * input array from keyboard
     */

    static void input(int[][] b, int n) {
	//....................
    }


    public static void main(String[] args) {
	Graph graph = new Graph();

	int n = 6;
	int[][] b = new int[n][n];

	input(b, n);

	graph.setData(b);

	graph.dispAdj();

	graph.breadth(1);

	System.out.println("Is G is connectd?" + graph.isConnected());

	System.out.println("Degree of the vertex A in G is " + graph.degree(0));

	System.out.println();
    }
}
