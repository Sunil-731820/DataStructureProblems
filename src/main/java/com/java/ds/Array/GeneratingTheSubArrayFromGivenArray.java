package com.java.ds.Array;

import java.util.Scanner;

public class GeneratingTheSubArrayFromGivenArray {
	
	static void getGeneratedSubArrayFromArray(int size , int[] arr, int start , int end) {
		if(end==size) {
			return ;
		}
		else if(start>end) {
			getGeneratedSubArrayFromArray(size, arr, 0, end+1);
		}
		else {
			System.out.print("[");
			for(int i=start;i<end;i++) {
				System.out.print(arr[i]+ ",");
			}
			System.out.println(arr[end] + "]");
			getGeneratedSubArrayFromArray(size, arr, start+1, end);
		}
	}
	public static void main(String[] args) {
		System.out.println("This Is The Example Of The Generating The SubArray From The Given Array");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Element In The Array is ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		int start = 0;
		int end = 0;
		getGeneratedSubArrayFromArray(size, arr, start, end);
		
	}

}
