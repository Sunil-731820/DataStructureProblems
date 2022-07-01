package com.java.ds.bitManipulations;

import java.util.Scanner;

public class CountFlipedToConvertAtoB {
	
	public static int countSet(int n) {
		int count = 0;
		while(n!=0) {
			count++;
			n &=(n-1);
		}
		return count;
	}
	
	public static int flippedCount(int a , int b) {
		return countSet(a^b);	
	}
	public static void main(String[] args) {
		System.out.println("Enter the first Number");
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		System.out.println("Enter the second Number");
		int secondNum = sc.nextInt();
		System.out.println(flippedCount(firstNum, secondNum));
	}

}
