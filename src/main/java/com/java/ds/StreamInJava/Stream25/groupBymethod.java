package com.java.ds.StreamInJava.Stream25;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class groupBymethod {
    public static void main(String[] args) {
        System.out.println("this is the example of the groupBy()");
        List<String> listOfData = Arrays.asList("Sunil","Kumar","Gupta","Sunil","Kumar","Gupta","Sunil","Kumar","Gupta");
        System.out.println("The Array is ");
        System.out.println(listOfData);
        /*
         * // Collect the list as map
         * // by groupingBy() method
         */
        Map<String ,Long> result = listOfData.stream()
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
        )) ;
        System.out.println("the Map of the Array list is ");
        System.out.println(result);

        // Converting the character array into the String 

        char[] ch = {'s','u','n','i','l'};
        System.out.println("the Character Array is ");
        System.out.print(ch);
        for (char c : ch) {
            System.out.print(c);
        }
// Using another way to concatenate

        String names = ch.toString();
        System.out.println("the Name is");
        System.out.println(names);
        String name1 = Stream.of(ch)
        .map(arr -> new String(arr))
        .collect(Collectors.joining());
        System.out.println("after concatening the character of the String is ");
        System.out.println(name1);

     

    }
}
