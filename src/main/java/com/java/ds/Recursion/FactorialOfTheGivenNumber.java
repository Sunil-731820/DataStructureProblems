package com.java.ds.Recursion;

public class FactorialOfTheGivenNumber {
	
	static int getAllFactorialOfGivenNumber(int numbers) {
		if(numbers<=1) {
			return 1;
		}
		else {
			return numbers * getAllFactorialOfGivenNumber(numbers-1);
		}
	}
	public static void main(String[] args) {
		int fact = getAllFactorialOfGivenNumber(7);
		System.out.println("The Factorial of The Given Number is ");
		System.out.println(fact);
	}

}
