package com.java.ds.Array.LeetCodeOfArray;

import java.util.Scanner;

public class MaximumSubArrayWithLargestSum {
	
	static int getMaximumSumArray(int size , int[] arr) {
		int max_so_far_Value = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for(int i=0;i<size;i++) {
			max_ending_here = max_ending_here + arr[i];
			if(max_so_far_Value<max_ending_here) {
				max_so_far_Value = max_ending_here;
			} 
			if(max_ending_here <0) {
				max_ending_here = 0;
			}
		}
		return max_so_far_Value;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Maximum SubArray ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Element In The Array is ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		int maximumSubArrayValue = getMaximumSumArray(size, arr);
		System.out.println("The value Of The Maximum SubArray is ");
		System.out.println(maximumSubArrayValue);
	}

}
