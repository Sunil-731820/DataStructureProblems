package com.java.ds.Basic;

import java.util.Scanner;

class VowelConst{
	public void check() {
		System.out.println("Enter the Character in English Alphabets");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("character is " + ch);
		 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			 System.out.println("the character is vowel " + ch);
		 }
		 else {
			 System.out.println("the character is constant " +ch);
		 }
	}
}

public class VowelOrConstant {
	public static void main(String[] args) {
		VowelConst obj1 = new VowelConst();
		obj1.check();
	}

}
