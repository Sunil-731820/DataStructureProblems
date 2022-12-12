package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseOfLimit {

    private static void printLimitedElement(List<Integer> ListOfNumber){
        System.out.println(
            ListOfNumber.stream()
            .limit(10)
            .collect(Collectors.toList())
        );
    }
    public static void main(String[] args) {
        System.out.println("The Use of The limit() ");
        List<Integer> listOfNumber = Arrays.asList(1,2,3,4,5,6,7,8,8,9,10,12,13,121,1223);
        System.out.println("All Record Are");
        System.out.println(listOfNumber);
        printLimitedElement(listOfNumber);
    }
    
}

