package com.java.ds.DesignPattern;

import java.util.Scanner;

public class RightHandedStarDifferentNumberPatternFrom1To5 {
	
	static void getRightHandedStarNumberPatternFrom1To5(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The RightHandedStarNumberPatternFrom1To5");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size Of The Array ");
		int size = sc.nextInt();
		getRightHandedStarNumberPatternFrom1To5(size);
	}

}
