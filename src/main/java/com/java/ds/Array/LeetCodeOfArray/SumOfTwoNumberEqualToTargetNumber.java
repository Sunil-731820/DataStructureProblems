package com.java.ds.Array.LeetCodeOfArray;


import java.util.Scanner;

public class SumOfTwoNumberEqualToTargetNumber {

	private static int[] sumOfTwoNumberWhichIsEqualToTarget(int size, int[] arr, int target) {
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	public static void main(String[] args) {
		System.out.println("This is The Example Of The Sum of The Two Number Which is Equal To Given Target Numbers ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter The Number of Element In the Array");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Target Element ");
		int target = sc.nextInt();
		System.out.println("The Array is ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Now Called The Method Check The Data In The Array Which is Equal To target");
		int[] index = sumOfTwoNumberWhichIsEqualToTarget(size, arr, target);
		for (int i = 0; i < size; i++) {
			System.out.println(index[i]);
		}

	}

}

