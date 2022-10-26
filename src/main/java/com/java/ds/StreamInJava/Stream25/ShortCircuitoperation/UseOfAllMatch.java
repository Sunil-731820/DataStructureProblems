package com.java.ds.StreamInJava.Stream25.ShortCircuitoperation;

import java.util.Arrays;
import java.util.List;

public class UseOfAllMatch {
    public static void main(String[] args) {
        /*
         * Stream allMatch(Predicate predicate) returns whether all elements of this
         * stream match the provided predicate. It may not evaluate the predicate on all
         * elements if not necessary for determining the result. This is a
         * short-circuiting terminal operation. A terminal operation is short-circuiting
         * if, when presented with infinite input, it may terminate in finite time.
         */

         List<Integer> ListOfNumber = Arrays.asList(3, 4, 6, 12, 20);
         boolean ans = ListOfNumber.stream().allMatch(n -> n%3==0);
         System.out.println("The Answer is");
         System.out.println(ans);
         


    }
    
}
