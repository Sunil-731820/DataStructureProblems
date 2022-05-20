package com.java.ds.Array.Level1PracticeQuestions;

import java.util.Scanner;

public class PeakElementInArray {
    public static void peak(){
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("priting the array is ");
        for(int j=0;j<size;j++){
            System.out.println(num[j]);
        }    
        int max = num[0];
        int index =0;
        for(int k =0;k<size;k++){
            if(max<=num[k]){
                max = num[k];
                index = k;
            }
        }
        System.out.println("the peak value of the array is ");
        System.out.println(max);
        System.out.println("the index of the maximum values is ");
        System.out.println(index);
    }
    public static void main(String[] args) {
        peak();

    }
    
}
