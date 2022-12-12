package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseOfSorted {
    /*
     * 
     * Returns a stream consisting of the elements of the stream passed, sorted
     * according to the natural order. If the elements of this stream are not
     * comparable, a java.lang.ClassCastException may be thrown when the terminal
     * operation is executed.
     */

     static void printSortedDataList(List<Integer> intListOfNumber){
        System.out.println(intListOfNumber.stream()
        .sorted()
        .collect(Collectors.toList()));
     }
    public static void main(String[] args) {
        System.out.println("The Use of the Sorted() in Stream ");
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        System.out.println("The Array of the String is ");
        System.out.println(names);
        List<String> result = names.stream()
        .filter(s ->s.startsWith("S"))
        .collect(Collectors.toList());
        System.out.println("After filetering the names which is start with S is ");
        System.out.println(result);

        // Sorting the List of the Names is 

        List<String> sortedName  = names.stream()
        .sorted()
        .collect(Collectors.toList());
        System.out.println("After sorting the Data From the Names list is ");
        System.out.println(sortedName);

        // Sorting the list of The Number
        List<Integer> intListOfNumber = Arrays.asList(1,2,3,121,21,323,43,56,565,45,6566,56,453,323);
        System.out.println("The List of The Arrays is  before Sorting Data is ");
        System.out.println(intListOfNumber);
        printSortedDataList(intListOfNumber);


    }
    
}
