package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class KadanesAlgorithmsOrContinuosLargestSumOf {
	static void getLargestSumOfContinuousArray(int[] arr , int size) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for(int i=0;i<size;i++) {
			max_ending_here = max_ending_here+arr[i];
			if(max_so_far<max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_ending_here<0) {
				max_ending_here = 0;
			}
		}
		System.out.println("The Maximum Sum is " + max_so_far);
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Kadane Algorithms ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The ELement In The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Element is ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
		getLargestSumOfContinuousArray(arr, size);
	}

}
