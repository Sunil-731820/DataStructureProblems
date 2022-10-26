package com.java.ds.StreamInJava.Stream25.ShortCircuitoperation;

import java.util.Arrays;
import java.util.List;

public class UseOfAnyMatch {
    public static void main(String[] args) {
        /*
         * Stream anyMatch(Predicate predicate) returns whether any elements of this
         * stream match the provided predicate. It may not evaluate the predicate on all
         * elements if not necessary for determining the result. This is a
         * short-circuiting terminal operation. A terminal operation is short-circuiting
         * if, when presented with infinite input, it may terminate in finite time.
         * 
         */

         List<Integer> listOfNumber = Arrays.asList(3, 4, 6, 12, 20);
         boolean num = listOfNumber.stream()
         .anyMatch(n -> n%3==0);
         System.out.println("The Any Match is ");
         System.out.println(num);
    }
    
}
