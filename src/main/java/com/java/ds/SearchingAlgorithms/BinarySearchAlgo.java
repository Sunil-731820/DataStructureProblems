package com.java.ds.SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearchAlgo {
	
	public static int BinarySearch(int[] arr ,int l , int r, int searchElement) {
		if(r>=l) {
			int mid = l+(r-l)/2;
			if (arr[mid]==searchElement) {
				return mid;
			}
			if(arr[mid]>searchElement) {
				return BinarySearch(arr, l, mid-1, searchElement);
			}
			else {
				return BinarySearch(arr, mid+1, r, searchElement);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int size;
		int[] ArrElement = new int[100];
		System.out.println("Enter the size of the array ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element of the array");
			ArrElement[i] = sc.nextInt();
		}
		System.out.println("priting the element of the array ");
		for(int j=0;j<size;j++) {
			System.out.println("the arrElement is " + ArrElement[j]);
		}
		System.out.println("enter the search ELement of the array ");
		int searchElement = sc.nextInt();
		
		int result = BinarySearch(ArrElement, 0,size,searchElement);
		if(result==-1) {
			System.out.println("the element is not found");
		}else {
			System.out.println("the element is found at index "+ result);
		}
		
	}

}
