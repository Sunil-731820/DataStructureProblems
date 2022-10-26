package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseOfFilter {
    public static void main(String[] args) {

        /*
         * 
         * Note:
         * 
         * Intermediate functions return a stream back.
         * On any stream you can execute any number of intermediate operations, but the
         * terminal operation should be single and written at last. So following are the
         * intermediate methods provided by the Stream
         * Predicate is a non-interfering, stateless predicate to apply to each element
         * to determine if it should be included or not.
         * 
         * 
         */
        /*
         * It returns a new stream consisting of the elements of the stream from which
         * it is called which are according to the predicate (condition).
         * 
         * 
         */
        System.out.println("The use Of filter in Stream ");
        List<String> names = Arrays.asList("Sunil","Harish","Subham");
        List<String> resultAfterFilter = names.stream()
        .filter(s ->s.startsWith("S"))
        .collect(Collectors.toList());
        System.out.println("After filtering the Data Start With S is ");
        System.out.println(resultAfterFilter);

        // I am calling printEvenNumberUsingStream
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        printEvenNumberUsingStream(number);
    }

    private static void printEvenNumberUsingStream(List<Integer> evenNumberlist){
        evenNumberlist.stream()
        .filter(i -> (i%2==0))
        .forEach(element -> System.out.println(element));

    }
    
}
