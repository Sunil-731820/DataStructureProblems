package com.java.ds.bitManipulations;

import java.util.Scanner;

public class CountTotalSetBitsFrom1ToN {
	
	public static int CountSetBits(int n) {
		int bitCounnt =0;
		for(int i=1;i<=n;i++) {
			bitCounnt +=CountSetBitsUtils(i);
		}
		return bitCounnt;
	}
	
	public static int CountSetBitsUtils(int x) {
		if(x<0) {
			return 0;
		}
		return (x%2==0 ? 0:1)+ CountSetBitsUtils(x/2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number");
		int number = sc.nextInt();
		System.out.println(CountSetBits(number));
	}

}
