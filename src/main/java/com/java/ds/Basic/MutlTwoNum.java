package com.java.ds.Basic;

import java.util.Scanner;

class MutiplyTwoNumber{
	public int mult() {
		System.out.println("Enter the First Numebr");
		Scanner sc = new Scanner(System.in);
		int Num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int Num2 = sc.nextInt();
		int result = Num1*Num2;
		return result;
	}
}
public class MutlTwoNum {
	public static void main(String[] args) {
		MutiplyTwoNumber obj1 = new MutiplyTwoNumber();
		int mult = obj1.mult();
		System.out.println("the Multiplication is " + mult);
	}

}
