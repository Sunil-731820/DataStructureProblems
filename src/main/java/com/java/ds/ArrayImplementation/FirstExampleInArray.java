package com.java.ds.ArrayImplementation;

public class FirstExampleInArray {
    public static void main(String[] args) {
        System.out.println("this is the example of first Array using java ");
        int[] number = new int[100];
        number[0] = 100;
        number[1] = 101;
        System.out.println("the Array of the Number is ");
        System.out.println(number);
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }
    }
}
