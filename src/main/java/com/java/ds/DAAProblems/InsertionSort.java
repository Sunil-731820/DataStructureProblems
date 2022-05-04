package com.java.ds.DAAProblems;

import java.util.Scanner;

public class InsertionSort {
	
	public static void Insertionsort() {
		int size ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int num[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element in the array");
			num[i] = sc.nextInt();
		}
		
		System.out.println("the Entered element is ");
		for(int j=0;j<size;j++) {
			System.out.print(num[j] + " ");
		}
		
		//applying the main insertion sort algorithms here 
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j = i-1;
			while(j>=0 && num[j]>key) {
				num[j+1] = num[j];
				j = j-1;
			}
			num[j+1] = key;
		}
		
		System.out.println("after sorting the array is ");
		for(int i=0;i<size;i++) {
			System.out.print(num[i] + "  ->");
		}
	}
	public static void main(String[] args) {
		Insertionsort();
	}

}
