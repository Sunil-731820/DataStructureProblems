package com.java.ds.DAAProblems;

import java.util.Scanner;

public class SelectionSort {
	
	public static void selection() {
		int size ;
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int num[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element in the array");
			num[i] = sc.nextInt();
		}
		System.out.println("the entered element in the array is ");
		for(int i=0;i<size;i++) {
			System.out.println(num[i] + "  ");
		}
		//applying main selection sort algorithms
		for(int i=0;i<size;i++) {
			 int min_index = i;
			for(int j=i+1;j<size;j++) {
				if(num[j]<num[min_index]) {
					min_index = j;
				}
			}
			int temp = num[min_index];
			num[min_index] = num[i];
			num[i] = temp;
		}
		
		//priting the sorted array 
		for(int i=0;i<size;i++) {
			System.out.print(num[i] + " ");
		}
		
	}
	
	
	public static void main(String[] args) {
		selection();
	}

}
