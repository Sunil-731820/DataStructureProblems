package com.java.ds.Array;

import java.util.Scanner;

public class MissingNumInArray {
	public static void main(String[] args) {
		int size;
		int[] num = new int[100];
		System.out.println("Enter the size of the array ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Number in the array");
			num[i] = sc.nextInt();
		}
		for(int j=0;j<size;j++) {
			System.out.println("the aarray is " + num[j]);
		}
		System.out.println("Enter the missing Number");
		int missingNum = sc.nextInt();
		for(int k=0;k<num.length;k++) {
			if(num[k]==missingNum) {
				System.out.println("No missing Number is ");
				break;
			}
		}
		
	}

}
