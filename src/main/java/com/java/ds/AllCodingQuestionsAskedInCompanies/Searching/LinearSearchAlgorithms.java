package com.java.ds.AllCodingQuestionsAskedInCompanies.Searching;

import java.util.Scanner;

public class LinearSearchAlgorithms {
	static void getLinearSearchMethod(int size , int[] arr, int searchElement) {
		System.out.println("Start The Linear Search method ----");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				System.out.println("The Index Of The Element is : "+ i);
				System.out.println("The Search Element Is : "+searchElement + " The Array Element is : "+ arr[i]);
				break;
			}else {
				System.out.println("The Element Not Found Exceptions ");
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Linear Search Algorithms ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array of the Element is ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("Enter The Search ELement for The Given Array");
		int searchElement = sc.nextInt();
		getLinearSearchMethod(size, arr, searchElement);
	}

}
