package com.java.ds.StreamInJava.Stream25.TerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class UseOfminimum {
    public static void main(String[] args) {
        
        // Stream<Integer> ListOfStream = Stream<Integer>(1,2,3,4,5,6,7);
        List<Integer> ListOfNumber = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(ListOfNumber);
        Integer minValue = ListOfNumber.stream().min(Integer :: compare).get();
        System.out.println("The Minimum Value is ");
        System.out.println(minValue);
        
    }


    
}
