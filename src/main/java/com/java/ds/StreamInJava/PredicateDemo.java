package com.java.ds.StreamInJava;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
    public static void main(String[] args) {
        System.out.println("The use of the Predicate ");
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        System.out.println("the Array list is");
        System.out.println(list1);
        list1.stream().filter(
            t -> t%2==1
        ).forEach(
            t->System.out.println(t)
        );
    }
}
