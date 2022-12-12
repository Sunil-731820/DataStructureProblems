package com.java.ds.StreamInJava.Stream25;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class builder {
    public static void main(String[] args) {
        System.out.println("This is the example of builder()");
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> stream = builder.add("Sunil")
        .build();
        System.out.println("The Builder of the String is ");
        stream.forEach(System.out::println);
        System.out.println(stream.toString());

        // Another Stream of String using builder 
        Stream.Builder<String> builder2 = Stream.builder();
        Stream<String> stream2 = builder2.
            add("Sunil")
            .add("Abhisek")
            .add("Harish")
            .build();

            stream2.forEach(System.out::println);

            // Another Example of the STream is 

            Stream.Builder<String> builder3 = Stream.builder();
            Stream<String> stream3 = builder3
            .add("SUNIL")
            .add("HARISH KUMAR GUPTA")
            .add("ABHISEK sARANGI")
            .add("SUBHAM kumar GUPTA").build();

            // Convert the element into the lowercase and storing them into the list

            List<String> listOfData = stream3.map(String::toLowerCase)
            .collect(Collectors.toList());
            System.out.println("The List of the Data is ");
            System.out.println(listOfData);
            System.out.println("Using Iterator ");
            Iterator itr = listOfData.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }


           
}
}