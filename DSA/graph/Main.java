package graph;

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
 
// import <name>

/**
 * @version 1.00
 * @since July 09, 2022 GumBox Inc.
 * @author falc0n (https://www.github.com/haft2k)
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
