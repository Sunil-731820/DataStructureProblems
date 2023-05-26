package com.java.ds.DesignPattern;

import java.util.Scanner;

public class OppositeRightHandedStarPatternDesign {
	
	static void getOppositeRightHandedStarPatternDesign(int size) {
		for(int i=0;i<size;i++) {
			for(int j=size;j>=i;j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of the OppositeRightHandedStarPatternDesign");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array");
		int size = sc.nextInt();
		getOppositeRightHandedStarPatternDesign(size);
	}

}
