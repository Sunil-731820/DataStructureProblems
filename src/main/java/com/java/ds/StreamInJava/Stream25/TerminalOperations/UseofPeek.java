package com.java.ds.StreamInJava.Stream25.TerminalOperations;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseofPeek {
    public static void main(String[] args) {
        /*
         * If you want to perform an action for debugging purposes, the peek method will
         * come in handy. This method accepts as an argument a lambda where you can do
         * any actions on this stream. As a result, the same stream will be returned.
         */

         System.out.println(
            Stream.of(1,2,3,4,5,6)
            .peek(element -> System.out.println(element))
            .collect(Collectors.toList())
         );
    }
}
