package com.java.ds.SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element of the array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("the array is ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j] + " ");
		}
		
		System.out.println("Enter the search element ");
		int searchElement = sc.nextInt();
		int result = search(arr, searchElement);
		if(result==-11) {
			System.out.println("the element not found in the array okay");
		}else {
			System.out.println("Element is  found in the array");
		}
	}
	
	public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

}
