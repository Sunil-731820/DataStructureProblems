package com.java.ds.Array;

import java.util.Scanner;

public class CheckEqualityOfArray {
	
	public static void check() {
		boolean status = false;
		System.out.println("Enter the size of the array 1");
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int num1[] = new int[size1];
		System.out.println("Enter the size of the array 2");
		int size2 = sc.nextInt();
		int num2[] = new int[size2];
		for(int i=0;i<size1;i++) {
			System.out.println("Enter the element of the first Array");
			num1[i] = sc.nextInt();
		}
		
		for(int j=0;j<size2;j++) {
			System.out.println("Enter the element of the seecond Array");
			num2[j] = sc.nextInt();
		}
		
		if(size1==size2) {
			for(int k=0;k<size1;k++) {
				if(num1[k]==num2[k]) {
					status = true;
				}
			}
				
		}
		if(status==true) {
			System.out.println("the Two Arrays are equal to each other");
		}
		else {
			System.out.println("the Two Arrays are not Equal");
		}
		
	}
	public static void main(String[] args) {
		check();
		
	}

}
