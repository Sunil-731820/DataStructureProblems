package com.java.ds.StreamInJava.optionalInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmailId(String email) throws Exception{
        List<Customer> customers = EkartDatabase.getAll();
        return customers.stream()
        .filter(
            customer -> customer.getEmail().equals(email))
            .findAny().orElseThrow(() -> new Exception("No customer exits with this email id "));
    }
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Sunil", "Sunil@gmail.com", Arrays.asList("616626","535535"));
        Customer customer1 = new Customer(102, "Harish", "Harish@gmail.com", Arrays.asList("61663226", "53552335"));

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        // Optional<Object> emailOptional = Optional.ofNullable(null)
        List<String> ListOfEMail = new ArrayList<>();
        Optional<String> emailOptional = Optional.of(customer.getEmail());    
        // ListOfEMail.addAll(customer);
        Optional<String> emailOptional1 = Optional.of(customer1.getEmail());
        System.out.println(emailOptional);
        System.out.println(emailOptional1);
    }
}
