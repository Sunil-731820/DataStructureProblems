package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseOfSkip {

    private static void skipNumber(List<Integer> listOfNumber){
        System.out.println(
            listOfNumber.stream()
            .skip(5)
            .collect(Collectors.toList())
        );
       
    }
    public static void main(String[] args) {
        /*
         * The skip() method discards the first n elements of a stream. n cannot be a
         * negative number and if it is higher than the size of a stream the method will
         * return an empty stream
         */
        List<Integer> ListOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        System.out.println("The Array of the List is ");
        System.out.println(ListOfNumber);
        skipNumber(ListOfNumber);

    }
    
}
