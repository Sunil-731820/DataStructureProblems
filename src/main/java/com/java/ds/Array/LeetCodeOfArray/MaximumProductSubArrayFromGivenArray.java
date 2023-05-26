package com.java.ds.Array.LeetCodeOfArray;

import java.util.Scanner;

public class MaximumProductSubArrayFromGivenArray {
	static int getMaximumProductSubArray(int size , int[] arr) {
		int result = arr[0];
		for(int i=0;i<size;i++) {
			int mul = arr[i];
			for(int j=i+1;j<size;j++) {
				result = Math.max(mul, result);
				mul = mul*arr[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Maximum Product Sub Array From Given Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Size of The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
		int res = getMaximumProductSubArray(size, arr);
		System.out.println("The Result is ");
		System.out.println(res);
	}

}
