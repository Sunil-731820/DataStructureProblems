package com.java.ds.Array.Level1PracticeQuestions;

import java.util.Scanner;
//sorting the array using merger sort algorithms which is very respective algorithms for sorting the array

public class SortTheArray {
   
    public static void merge(int arr[],int l ,int m,int r){
        //finding the size of the two subarray
        int n1 = m-l+1;
        int n2 = r-m;

        //create two temp array
        int L[] = new int[n1];
        int R[] = new int[n2];
        //copy the array to the temp array
        for(int i=0;i<n1;i++){
            L[i] = arr[l+1];
        }

        for(int j=0;j<n2;j++){
            R[j] = arr[m+1+j];
        }

        //merger the two temp array 
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        //copying the remaining element in the array
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[],int l,int r){
        if(l<=r){
            int m = l+(r-l)/2;
            sort(arr, l, m);
            sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6,7};
        System.out.println("the given array is ");
        printArray(arr);
        sort(arr, 0, arr.length-1);
        System.out.println("after sorting the array is ");
        printArray(arr);
    }
}
