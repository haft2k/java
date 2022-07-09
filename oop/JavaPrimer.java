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

// package ....

/**
 * @version 1.00
 * @since July 09, 2022 GumBox, Inc
 * @author falc0n (https://www.github.com/haft2k)
 */

 // import <name>
class JavaPrimer {
    /** main program */
    public static void main(String[] args) {
        Season season = Season.WINTER;
	System.out.println(enumTypes);
    }

    /**
     * ...method doSomething documentation comment...
     */
    public void doSomething() {
	// ... implementation goes here....
}


/**
 *
 * Class EnumTypes
 * - enum is special "class" that represents a group of constants
 * (unchangeable - can't be overridden, like "final")
 * - use enum when you have values that you know aren't going to change
 *
 *
 * @version 1.0  April 17th, 2022
 * @author  haft2k
 */
enum Season {
    /** constant1, .... constant n; */
    WINTER,
    SPRING,
    SUMMER,
    FALL;


}
