package com.java.ds.bitManipulations;

import java.util.Scanner;

public class CountSetBits {
	public static int countSetBits(int number) {
		int count =0;
		while(number>0) {
			count +=number &1;
			number>>=1;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number by the user");
		int number = sc.nextInt();
		System.out.println(countSetBits(number));
		
	}

}
