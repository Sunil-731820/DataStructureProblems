package com.java.ds.ParallelSortingInJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FisrtExampleOfParallelSort {
    public static void main(String[] args) {
        int[] number = {5,8,1,0,6,9};
        System.out.println("The Number of the Array is ");
        System.out.println(number);
        for(int i:number){
            System.out.println(i);
        }

        // Sorting the arrays elment in parallel
        // Arrays.parallelSort(number);
        // System.out.println("After sorting the arrays is ");
        // for(int num : number){
        //     System.out.println(num);
        // }

        // Sorting the data from start index 0 to end index 4
System.out.println("i am sorting the Data From 0 to 4 only");
        Arrays.parallelSort(number,0,4);
        for(int num1 :number){
            System.out.println(num1);
        }
    }
}
