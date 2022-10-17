package com.java.ds.StreamInJava.optionalInJava;

public class WithoutOptionInString {
    public static void main(String[] args) {
        System.out.println("this is the EXample of the Without optional Statement in java");
        String[] str1 = new String[10];
        String lowerCase = str1[5].toLowerCase();
        System.out.println("The Lowercase String is ");
        System.out.println(lowerCase);

        // To avoid the NullPointerException in String use Optional method
        
    }
}
