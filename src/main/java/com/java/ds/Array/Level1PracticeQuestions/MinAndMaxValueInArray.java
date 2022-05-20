package com.java.ds.Array.Level1PracticeQuestions;

import java.util.Scanner;

public class MinAndMaxValueInArray {
    public static void minElement(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("priting the element of the array");
        for(int j=0;j<size;j++){
            System.out.println(num[j]);
        }
        int minvalue = num[0];
        for(int k=0;k<size;k++){
            if(minvalue>num[k]){
                minvalue = num[k];
            }
        }
        System.out.println("the minimum value of the array is ");
        System.out.println(minvalue);
    }

    public static void maxElement(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num1[] = new int[size];
        for(int i=0;i<size;i++){
            num1[i] = sc.nextInt();
        }
        System.out.println("the element of the second array");
        for(int j=0;j<size;j++){
            System.out.println(num1[j]);
        }
        int maxValue = num1[0];
        System.out.println("finding the maximum element in the array");
        for(int j=0;j<size;j++)
        {
            if(maxValue<num1[j]){
                maxValue = num1[j];
            }

        }
        System.out.println("the maximum value in the array is ");
        System.out.println(maxValue);


    }
    public static void main(String[] args) {
        System.out.println("calling the minimum function ");
        minElement();
        System.out.println("calling the maximum function ");
        maxElement();
    }
}
