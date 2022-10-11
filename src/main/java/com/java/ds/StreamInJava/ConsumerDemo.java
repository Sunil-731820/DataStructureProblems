package com.java.ds.StreamInJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        System.out.println("The use of the consumer in java");
        Consumer<Integer> consumer = t -> System.out.println(t);
        consumer.accept(10);
        System.out.println("the consumer is ");
        System.out.println(consumer);
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        // The use of the for each 
        for(Integer num : list1){
            System.out.println(num);
        }

        // The use of the for each with Stream 

        list1.stream().forEach(t->System.out.println(t));
    }
}
