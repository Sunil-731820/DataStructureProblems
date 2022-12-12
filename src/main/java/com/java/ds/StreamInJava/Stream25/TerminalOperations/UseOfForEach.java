package com.java.ds.StreamInJava.Stream25.TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class UseOfForEach {
    static void printDistinctElement(List<Integer> listOfNumber) {
        listOfNumber.stream()
                .distinct()
                .forEach(element -> System.out.println(element));
    }

    public static void main(String[] args) {
        System.out.println("The use of Distinct() in stream API");
        List<Integer> ListOfNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        printDistinctElement(ListOfNumber);
    }
    
}
