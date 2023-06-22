package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class MergeTwoSortedArrayInSingleArray {
	
	static void sortTheGivenMergeArray(int[] arr , int size) {
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Array is AFter Sorting the Merging Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void addTwoArrayBeforeMerge(int[] arr1 , int[] arr2 , int size1 , int size2) {
		int totalSize = size1+ size2;
		for(int i=0;i<totalSize;i++) {
			arr1[size1+1] = arr2[i];  
		}
		System.out.println("The Array is After Adding into one Is ");
		for(int i=0;i<totalSize;i++) {
			System.out.print(arr1[i] + " ");
		}
	}
	
	static void mergeTwoSortedArrayInToSingleArray(int[] arr1 , int[] arr2 , int size1,int size2) {
		int totalSize = size1 + size2;
		System.out.println("The Total Size of The Array is : "+ totalSize);
		int[] thirdArray = new int[totalSize];
		for(int i=0;i<size1;i++) {
			thirdArray[i] = arr1[i];
		}
		for(int i=0;i<size2;i++) {
			thirdArray[i+size1] = arr2[i];
		}
		
		
		System.out.println("The Array is AFter Appending Into The First Array Into The Third Array is ");
		for(int i=0;i<totalSize;i++) {
			System.out.print(thirdArray[i]+ " ");
		}
		System.out.println("calling The method called Sort is : ");
		sortTheGivenMergeArray(thirdArray, totalSize);
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Merging The Two Sorted Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The First array ");
		int size1 = sc.nextInt();
		int[] firstArray = new int[size1];
		for(int i=0;i<size1;i++) {
			System.out.println("Enter the  element In The first Array");
			firstArray[i] = sc.nextInt();
		}
		System.out.println("Enter The Size Of The Second Array");
		int size2 = sc.nextInt();
		int[] secondArray = new int[size2];
		for(int j=0;j<size2;j++) {
			System.out.println("Enter The Element In The Second Array ");
			secondArray[j] = sc.nextInt();
		}
//		addTwoArrayBeforeMerge(firstArray, secondArray, size1, size2);
		mergeTwoSortedArrayInToSingleArray(firstArray, secondArray, size1, size2);
	}

}
