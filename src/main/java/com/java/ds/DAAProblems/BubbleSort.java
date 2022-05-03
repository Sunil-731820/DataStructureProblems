package com.java.ds.DAAProblems;

import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort() {
		int size ;
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int num[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("enter the element in the array ");
			num[i] = sc.nextInt();
		}
		System.out.println("the Entered element is ");
		for(int j=0;j<size;j++) {
			System.out.println(num[j] + " ");
		}
		//main sorting method of the bubble sorting algorithms
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]>num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("after sorting the element is ");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+ "  ");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		bubbleSort();
	}

}
