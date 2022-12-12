package com.java.ds.StreamInJava.Stream25;

import java.util.stream.IntStream;

public class UseOfAllMatch {
    public static void main(String[] args) {
        System.out.println("this is the example of the allMatch() in java");
        IntStream stream = IntStream.of(3,5,9,12,14);
        System.out.println("The Stream is ");
        System.out.println(stream.toString());
        boolean answer = stream.allMatch(num ->num%3==0);
        System.out.println(answer);

        // The another Example of AllMatch()

        IntStream stream1 = IntStream.concat(
            IntStream.of(-2,-4,-6,-8), IntStream.of(-1,0,1,5));
            System.out.println(stream1);
            boolean answer1 = stream1.allMatch(num ->num<2);
            System.out.println("The Result is ");
            System.out.println(answer1);

            // The Another Example of the AllMatch() 
            IntStream stream2 = IntStream.empty();
            boolean answer2 = stream2.allMatch(num -> true);
            System.out.println("The Result of the Empty Stream if it is true");
            System.out.println(answer2);
    }
}
