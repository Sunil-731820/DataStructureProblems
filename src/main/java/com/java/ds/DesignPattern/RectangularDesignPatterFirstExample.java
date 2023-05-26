package com.java.ds.DesignPattern;

import java.util.Scanner;

public class RectangularDesignPatterFirstExample {
	
	static void getRectDesignPattern(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("this is the Example Of The first Desiging pattern ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		getRectDesignPattern(size);
	}

}
