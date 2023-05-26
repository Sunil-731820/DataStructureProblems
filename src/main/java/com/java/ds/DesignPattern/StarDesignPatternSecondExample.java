package com.java.ds.DesignPattern;

import java.util.Scanner;

public class StarDesignPatternSecondExample {
	
	static void getStarPatternDesign(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Right handed Star Pattern");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array is ");
		int size = sc.nextInt();
		getStarPatternDesign(size);
		
		
	}

}
