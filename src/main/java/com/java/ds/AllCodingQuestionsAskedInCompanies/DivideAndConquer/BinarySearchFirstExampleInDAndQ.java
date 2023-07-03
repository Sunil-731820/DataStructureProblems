package com.java.ds.AllCodingQuestionsAskedInCompanies.DivideAndConquer;

import java.util.Scanner;

public class BinarySearchFirstExampleInDAndQ {
	
	static int getBinarySearchSolutions(int size , int[] arr,int key) {
		int left = 0; 
		int right= arr.length-1 , mid;
		while(left<=right) {
			mid = left + (right-left)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				left = mid + 1;
			}
			else {
				right = mid-1;
			}
			
		}
		return -1;

	}
	public static void main(String[] args) {
		System.out.println("This is The EXample of the Binary Search EXample");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array");
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("ENter The Key Element To Performed Search Operations ");
		int key = sc.nextInt();
		int res = getBinarySearchSolutions(size, arr, key);
		if(res==-1) {
			System.out.println("No Element Found In The Array Pls Try Agaian Later");
		}else {
			System.out.println("The ELement Found In The Array : " + res);
		}
	}

}
