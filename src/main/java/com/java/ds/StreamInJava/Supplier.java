package com.java.ds.StreamInJava;

import java.util.Arrays;
import java.util.List;

public class Supplier {
    public static void main(String[] args) {
        System.out.println("this is the example of the Supplier");
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        // list1.add(1);
        // list1.add(2);
        System.out.println("the list of the array is ");
        // System.out.println(list1);
        for(Integer number : list1){
            System.out.println(number);
        }
        // The use of findAny()

        // System.out.println(list1.stream().findAny().orElseGet(() -> "Hi viewer"));

    }
}
