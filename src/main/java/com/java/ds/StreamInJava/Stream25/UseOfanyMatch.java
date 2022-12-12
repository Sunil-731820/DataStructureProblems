package com.java.ds.StreamInJava.Stream25;

import java.util.stream.IntStream;

public class UseOfanyMatch {
    public static void main(String[] args) {
        System.out.println("this is the example of the anyMatch()");
        IntStream stream = IntStream.of(1,2,3,4,5,6);
        boolean answer = stream.anyMatch(num ->(num-5)>0);
        System.out.println("The Boolean Value is "+ answer);
    }
}
