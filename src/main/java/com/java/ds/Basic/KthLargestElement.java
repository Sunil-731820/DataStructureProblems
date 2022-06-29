package com.java.ds.Basic;

import java.util.Scanner;

public class KthLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("the element of the array is ");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
