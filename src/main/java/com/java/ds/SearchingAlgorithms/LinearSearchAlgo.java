package com.java.ds.SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearchAlgo {
	
	public static int search(int[] arr , int searchElement) {
		int length = arr.length;
		for(int i=0;i<length;i++) {
			if(arr[i]==searchElement) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int size;
		int[] Element = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element into the array");
			Element[i] = sc.nextInt();
		}
		System.out.println("Showing the element in the array");
		for(int j=0;j<size;j++) {
			System.out.println("the Element is " + Element[j]);
		}
		System.out.println("Enter the Element that is to be find");
		int searchElement = sc.nextInt();
		
		//checking the search element if it is found 
		int result = search(Element, searchElement);
		if(result==-1) {
			System.out.println("the element is not found ");
		}else {
			System.out.println("the element is found at index  " + result);
		}
		
	}

}
