package com.java.ds.Recursion;

public class PrintingTheNumberAccordingToUserChoice {
	
	static void getAllNumber(int numbers){
		if(numbers<0) {
			return ;
		}
		System.out.println(numbers);
		numbers = numbers-1;
		getAllNumber(numbers);
	}
	public static void main(String[] args) {
		getAllNumber(9);
	}

}
