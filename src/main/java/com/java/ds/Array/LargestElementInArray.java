package com.java.ds.Array;

import java.util.Scanner;

public class LargestElementInArray {
	
	public static void LargestElement() {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int num[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in the array");
			num[i] = sc.nextInt();
		}
		
		System.out.println("Printing the array");
		for(int j=0;j<size;j++) {
			System.out.println(num[j] + " ");
		}
		
		int largest = num[0];
		for(int k=0;k<size;k++) {
			if(num[k]>largest) {
				largest = num[k];
			}
		}
		System.out.println("the Largest Element is " + largest);
	}
	public static void main(String[] args) {
		LargestElementInArray.LargestElement();
		
	}

}
