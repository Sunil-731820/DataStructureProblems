package com.java.ds.ArraySatudayAndSundayWorkOnly;

import java.util.Scanner;

public class MaximumAndMinimumElementInArray {
	
	public static void maximumAndMinimumArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int sizeOfArray = sc.nextInt();
		int array[] = new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			System.out.println("Enter The Element in The Array ");
			array[i] = sc.nextInt();
		}
		System.out.println("The Array of The Element is ");
		for(int j=0;j<sizeOfArray;j++) {
			System.out.print(array[j]+ " ");
		}
//		Finding The maximum Values Here 
		int tempMaxData = array[0];
		int maxmimumElement;
		System.out.println("The temp Max Data is "+ tempMaxData);
		for(int k=0;k<sizeOfArray;k++) {
			if(tempMaxData>array[k]) {
				maxmimumElement = tempMaxData;
				break;
			}
		}
		System.out.println("The Maximum Values is "+ tempMaxData);
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The maximum and Minimum Element in The Array using Method In The Java");
		maximumAndMinimumArray();
	}

}
