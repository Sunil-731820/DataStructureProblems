package com.java.ds.StreamInJava.Stream25.ShortCircuitoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UseOfFindFirst {
    public static void main(String[] args) {
        /*
         * The findFirst() method finds the first element in a Stream. So, we use this
         * method when we specifically want the first element from a sequence.
         * 
         * When there is no encounter order, it returns any element from the Stream.
         * According to the java.util.streams package documentation, “Streams may or may
         * not have a defined encounter order. It depends on the source and the
         * intermediate operations.”
         * 
         * The return type is also an Optional instance, which is empty if the Stream is
         * empty too:
         */

         List<String> listofString = Arrays.asList("A", "B", "C", "D");
         System.out.println("The List of the String is ");
         System.out.println(listofString);
         Optional<String> firstElement =  listofString.stream()
         .findFirst();
         System.out.println("The First String is ");
         System.out.println(firstElement);
    }
    
}
