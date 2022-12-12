
package com.java.ds.StreamInJava.Stream25.TerminalOperations;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class useOfReduce {
    public static void main(String[] args) {
        /*
         * The reduce function can be used whenever you want to take the values from a
         * stream and aggregate them into a single value. An example could be that you
         * want to take all the numeric values from a stream and add all of these
         * values.
         */
        Optional<Integer> sum = Stream.of(1,3,5,10)
        .reduce((first,sec) -> first+sec);
        System.out.println("After the use of the Reduce()");
        System.out.println("The sum of the Value is " + sum);
    }
    
}
