package com.java.ds.StreamInJava.Stream25.ShortCircuitoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOfFindAny {
    public static void main(String[] args) {
        /*
         * In Java Stream API findAny() method is used to return some element of the
         * stream. Method returns the element as an Optional or an empty Optional if the
         * stream is empty.
         * 
         */

         List<Integer> listOfNumber = Arrays.asList(3, 9, 1, 9, 7, 8);
         Optional<Integer> anyNumberFromStream = listOfNumber.stream()
         .filter(n -> n>5)
         .findAny();
         System.out.println(anyNumberFromStream);


    }
    
}
