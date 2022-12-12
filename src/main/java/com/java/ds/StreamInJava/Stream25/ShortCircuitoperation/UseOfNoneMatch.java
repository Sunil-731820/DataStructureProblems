package com.java.ds.StreamInJava.Stream25.ShortCircuitoperation;

import java.util.stream.Stream;

public class UseOfNoneMatch {
    public static void main(String[] args) {
        /*
         * You should use this operation when you want to verify that no elements in the
         * stream match specific criteria. This method will return a boolean value and
         * will take as an argument a lambda that returns a boolean condition.
         */
        boolean noneMatch = Stream.of(1,2,3,4,5)
        .noneMatch(n -> n<0);
        System.out.println("None Match is "+ noneMatch);

    }
    
}
