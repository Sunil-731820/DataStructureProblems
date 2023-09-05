package com.java.ds.Recursion;

import java.util.Scanner;

public class SumOfSeriesUsingRecursion {
	
	static int  getSumOfAllNumbers(int numbers) {
		if(numbers!=0) {
			return numbers + getSumOfAllNumbers(numbers-1);
		}
		else {
			return numbers;
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter The Number to Find The Sum");
		Scanner sc = new Scanner(System.in);
		int givenNumber = sc.nextInt();
		int sum = getSumOfAllNumbers(givenNumber);
		System.out.println("The Sum of The Number Using recursion is ");
		System.out.println(sum);
	}

}
