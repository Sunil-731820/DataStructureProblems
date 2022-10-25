package com.java.ds.StreamInJava.Stream25;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageInt {
    public static void main(String[] args) {
        System.out.println("this is the example of the avarageInt() ");
        Stream<String> string = Stream.of("3","4","5");
        System.out.println("The String of the Number is ");
        System.out.println(string);

        double avarage = string.collect(
            Collectors.averagingInt(num -> Integer.parseInt(num))
        );
        System.out.println("the average value of the above data is ");
        System.out.println(avarage);

    }
}
