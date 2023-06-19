package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	
	static void getSubArrayOfGivenSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array ");
		int size = sc.nextInt();
		int[]  arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array of The Integer is ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println("ENter The Target Sum ");
		int target = sc.nextInt();
		for(int i=0;i<size;i++) {
			int currentSum = arr[i];
			if(currentSum==target) {
				System.out.println("The Left Index is : "+ i);
				return ;
			}
			else {
				for(int j=i+1;j<size;j++) {
					currentSum = currentSum + arr[j];
					if(currentSum==target) {
						System.out.println("The Left And Right Index Is : "+ i + "  "+  j);
						return;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of tHe Sub Array of The Given Sum Of Integers ");
		getSubArrayOfGivenSum();
	}

}
