package com.java.ds.Basic;

import java.util.Scanner;

class Addtwo{
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num11 = sc.nextInt();
		System.out.println("Enter the second Number");
		int num21 = sc.nextInt();
		int sum = num11+ num21;
		System.out.println("the sum of the Two Number is " + sum);
		
	}
}

public class AddTwoNum {
	public static void main(String[] args) {
		Addtwo obj = new Addtwo();
		obj.add();
		
	}
	

}
