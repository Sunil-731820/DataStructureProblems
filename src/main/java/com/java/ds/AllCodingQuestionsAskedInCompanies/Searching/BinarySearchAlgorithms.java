package com.java.ds.AllCodingQuestionsAskedInCompanies.Searching;

import java.util.Scanner;

public class BinarySearchAlgorithms {
	static int getBinarySearch(int size , int[] arr , int searchElement) {
		System.out.println("The Binary Search Start From Here ");
		int leftSide = 0 ; 
		int rightSide = size-1;
		if(leftSide<=rightSide) {
			int midValue = leftSide + (rightSide-leftSide )/2;
			if(arr[midValue]==searchElement) {
				return midValue;
			}else if(arr[midValue]<searchElement) {
				leftSide = midValue +1;
			}
			else  {
				rightSide = midValue-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Binary Search Algorithms ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int[]  arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array of The Element is ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.println("Enter The Search Element In the Array ");
		int searchElement = sc.nextInt();
		int searchFound = getBinarySearch(size, arr, searchElement);
		System.out.println(" The Search Element is : "+ searchFound);
	}

}
