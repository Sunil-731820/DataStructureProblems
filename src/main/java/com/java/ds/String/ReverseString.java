package com.java.ds.String;

import java.util.Scanner;

class Reverse{
	public void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String By the User");
		String str = sc.nextLine();
		StringBuilder input1 = new StringBuilder();
		input1.append(str);
		input1.reverse();
		System.out.println("the reverse of the array is ");
		System.out.println(input1);
	}
}
public class ReverseString {
	public static void main(String[] args) {
		Reverse rev = new Reverse();
		rev.reverse();
		
	}

}
