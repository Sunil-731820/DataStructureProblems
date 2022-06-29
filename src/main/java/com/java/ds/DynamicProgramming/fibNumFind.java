package com.java.ds.DynamicProgramming;

import java.util.Scanner;

public class fibNumFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        Long n = sc.nextLong();
        int firstTerm = 0, secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
