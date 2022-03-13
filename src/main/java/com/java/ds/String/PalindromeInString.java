package com.java.ds.String;

import java.util.Scanner;


public class PalindromeInString {
	   public static void main(String args[]) {
	      String myString ;
	      System.out.println("Enter the String ");
	      Scanner sc = new Scanner(System.in);
	      myString = sc.nextLine();
	      StringBuffer buffer = new StringBuffer(myString);
	      buffer.reverse();
	      String data = buffer.toString();
	      if(myString.equals(data)){
	         System.out.println("Given String is palindrome");
	      } else {
	         System.out.println("Given String is not palindrome");
	      }
	   }
}