package com.java.ds.StreamInJava.optionalInJava;

import java.util.Optional;

public class WithOptional {
    public static void main(String[] args) {
        // String[] str = new String[10];
      String  str = "HELLO SUNIL";
        Optional<String> checkNull = Optional.ofNullable(str);
        if(checkNull.isPresent()){
            String lowercase = str.toLowerCase();
            System.out.println(lowercase);
        }else{
            System.out.println("String is not available for converting into lower case");
        }
    }
}
