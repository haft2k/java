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
package recursion;

/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */



public class TowerOfHanoi {

    void move(int numOfDisc, char source, char destination, char auxiliary) {
	if (numOfDisc == 1) {
	    System.out.println("Moving disc 1" + ": " + source + " to " + destination);
	    return;
	} else {
	    // move (n - 1) from source to auxiliary
	    // use source to source-sub
	    move(numOfDisc-1, source, auxiliary, destination);

	    // move remainder (n - 2).v.v.1
	    // from source to destination
	    System.out.println("Moving disc " + numOfDisc + ": " + source + " to " + destination);

	    // move (n - 1) from auxiliary --> destination
	    move(numOfDisc-1, auxiliary, destination, source);

	}
    }


    public static void main(String []args) {
	TowerOfHanoi tower = new TowerOfHanoi();
	tower.move(3, 'A', 'C', 'B');
    }



}
