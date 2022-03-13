package com.java.ds.Basic;

import java.util.Scanner;

class AsciiCharacter{
	public void character() {
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int num1 = ch;
		System.out.println("the ascii values of the character is  " + num1);
	}
}
public class AsciiValueOfChar {
	public static void main(String[] args) {
		AsciiCharacter obj = new AsciiCharacter();
		obj.character();
	}

}
