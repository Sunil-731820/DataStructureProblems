package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class CountTheTripletInArray {
	
	static void getNumberOftripletsInArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element In The Array ");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Element in The Array is ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+ " ");
		}
		int counter = 0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				for(int k = j+1;k<size;k++) {
					if(arr[i] + arr[j] == arr[k]) {
						counter++;
					}
					else if(arr[i]+arr[k]==arr[j]) {
						counter++;
					}
					else if(arr[j]+ arr[k]==arr[i]) {
						counter++;
					}
				}
			}
		}
		System.out.println("The Value Of Counter is "+ counter);
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Counting The Triplets Of The Given Array Integers ");
		getNumberOftripletsInArray();
	}

}
