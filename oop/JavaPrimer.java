/*
 * 
 * Copyright (c) 2022 gumpbox, Inc. All Rights reserved.
 * 
 * This code is the for community. I hope you reading enjoy!!
 *
 * 
 */
// package ....

// import java.*;

/**
 * 
 * Class JavaPrimer main
 * 
 *
 
 * @version 1.0  April 17th, 2022
 * @author  tdh2000 
 */
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
 * @author  tdh2000 
 */ 
enum Season {
    /** constant1, .... constant n; */
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    
}
