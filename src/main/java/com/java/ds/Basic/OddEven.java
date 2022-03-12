package com.java.ds.Basic;

import java.util.Scanner;

class OddOrEvenNum{
	public void OddEvenNum() {
		System.out.println("Enter the Number to check Whether its is odd Or Even Nuber");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if(num1%2==0) {
			System.out.println("the Number is Even ");
			System.out.println(num1);
		}
		else {
			System.out.println("the Number is Odd Number");
			
			System.out.println(num1);
		}
		
	}
}

public class OddEven {
	public static void main(String[] args) {
		OddOrEvenNum obj1 = new OddOrEvenNum();
		obj1.OddEvenNum();
		
	}

}
