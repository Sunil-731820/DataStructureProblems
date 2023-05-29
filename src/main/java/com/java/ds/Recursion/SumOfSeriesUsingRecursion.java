package com.java.ds.Recursion;

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
		int sum = getSumOfAllNumbers(10);
		System.out.println("The Sum of The Number Using recursion is ");
		System.out.println(sum);
	}

}
