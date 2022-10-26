package com.java.ds.StreamInJava.Stream25.IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UseOfMap {
    /*
     * Mapper is a non-interfering, stateless function to apply to each element of the stream. 
     * It returns a stream consisting of the results of applying the given function to the element of 
     * the passed stream.
     */

     static void findCube(List<Integer> listOfNumber){
        listOfNumber.stream()
        .map(element -> (element*element*element))
        .forEach(obj -> System.out.print(obj+" "));

        // Applying distinct on Map()
        System.out.println("I am Getting distict values after finding the cube of each element");
        System.out.println(
                listOfNumber.stream()
                        .distinct()
                        .map(element -> element * element * element)
                        .collect(Collectors.toList())
        );

        // Appying Sorted On This

        System.out.println(
            listOfNumber.stream()
            .distinct()
            .sorted()
            .map(element -> element*element*element)
            .collect(Collectors.toList())
        );

        // Applying Filter() that values
        // only below 10000 will be printed
        System.out.println("After the use of the distict , sorted , map and filter and then get the List of The element");
        System.out.println(
            listOfNumber.stream()
            .distinct()
            .sorted()
            .map(element -> element*element*element)
            .filter(element -> element<10000)
            .collect(Collectors.toList())
        );

     }
    public static void main(String[] args) {
        System.out.println("The use of the Map ");
        List<Integer> number = Arrays.asList(2,3,4,5);
        System.out.println("The Number is ");
        System.out.println(number);

        // the USe of Map() in Stream is 
        List<Integer> square = number.stream()
        .map(x ->x*x)
        .collect(Collectors.toList());
        System.out.println("The Square of the Each Number is ");
        System.out.println(square);

        // The use of Map With Various Attributes
        List<Integer> listOfNumber = Arrays.asList(5, 19, 8, 23, 6, 54, 32, 5, 23, 5, 19, 8, 23, 6, 54, 32, 5, 23);
        System.out.println("Before Find the Cube of the Number is ");
        System.out.println(listOfNumber);
        findCube(listOfNumber);

      



    }
    
}
