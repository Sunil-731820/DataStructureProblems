package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class MissingNumberInArray {

	static void checkTheMissingNumber(int size, int[] arr) {
		
		int sum = ((size+1)*(size+2))/2;
		for(int i=0;i<size;i++) {
			sum = sum - arr[i];
		}
		System.out.println("The Missing Number is " + sum);

	}

	public static void main(String[] args) {
		System.out.println("This is The Example Of The Missing Number In The Array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Element In The Array is ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		checkTheMissingNumber(size, arr);
	}

}
