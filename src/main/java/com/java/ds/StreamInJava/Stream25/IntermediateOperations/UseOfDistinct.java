package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class UseOfDistinct {
    /*
     * It returns a stream consisting of the distinct(different) elements of the
     * passed stream. For ordered stream, the selection of the distinct elements is
     * stable (For duplicated elements, the element appearing first in the encounter
     * order is preserved). While for non-ordered streams it does not make any
     * guarantee for stability.
     */

     static void printDistinctElement(List<Integer> listOfNumber){
            listOfNumber.stream()
            .distinct()
            .forEach(element -> System.out.println(element));
     }
     
    public static void main(String[] args) {
        System.out.println("The use of Distinct() in stream API");
        List<Integer> ListOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
        printDistinctElement(ListOfNumber);
    }
    
}
