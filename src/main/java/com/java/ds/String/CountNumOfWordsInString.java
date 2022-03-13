package com.java.ds.String;

import java.util.Scanner;

public class CountNumOfWordsInString {
	
	public static void countWord() {
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		words = words.toLowerCase();
		String arrWord[] = words.split(" ");
		System.out.println("the length of String is " + words.length());
		int counter = 0;
		for(int i=0;i<arrWord.length;i++) {
			counter++;
		}
		System.out.println("The Length of the array Words is " + counter);
		
	}
	
	public static void main(String[] args) {
	countWord();	
	}

}
