package com.java.ds.Basic;

import java.math.BigInteger;
import java.util.Scanner;

public class BigMultiplication {
    public static void main(String[] args) {
        BigInteger result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the First Number");
        String input1 = sc.nextLine();
        System.out.println("Enter the second number");
        String input2 = sc.nextLine();
        BigInteger a = new BigInteger(input1);
        BigInteger b = new BigInteger(input2);
        result = a.multiply(b);
        System.out.println("the multiplication of the two number is " + result);
    }
}
