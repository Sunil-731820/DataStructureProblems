package com.java.ds.StreamInJava.optionalInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
    
    public static List<Customer> getAll(){
        return Stream.of(
         new Customer(101, "SUnil", "Sunil@gmail.com", Arrays.asList("1616626","6262662")),
         new Customer(102, "Harish", "Harish@gmail.com", Arrays.asList("166266","72772"))   
        ).collect(Collectors.toList());
    }
}
