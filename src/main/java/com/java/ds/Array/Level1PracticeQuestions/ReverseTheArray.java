package com.java.ds.Array.Level1PracticeQuestions;

import java.util.Scanner;



public class ReverseTheArray {
    public static void reverse(){
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("the element of the array is ");
        for(int j=0;j<size;j++){
            System.out.println(num[j]);
        }
        System.out.println("now reversing the array ");
        for(int k=num.length-1;k>=0;k--){
            System.out.println(num[k]);
        }    
    }
    public static void main(String[] args) {
      reverse();
    }
}
