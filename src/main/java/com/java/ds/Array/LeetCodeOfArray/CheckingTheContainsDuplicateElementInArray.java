package com.java.ds.Array.LeetCodeOfArray;

import java.util.Scanner;

public class CheckingTheContainsDuplicateElementInArray {
	
	static boolean checkTheDuplicateElementInArray(int size , int[] arr) {
		boolean check = false;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					check = true;
				}
			}
		}
		return check;
	}
	public static void main(String[] args) {
		System.out.println("CHecking The Duplicate Element In The Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
		boolean checked = checkTheDuplicateElementInArray(size, arr);
		if(checked) {
			System.out.println("The Duplicate Element Is Found");
		}else {
			System.out.println("The Duplicate Element is Not There ");
		}
	}

}
