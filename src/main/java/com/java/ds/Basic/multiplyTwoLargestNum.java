package com.java.ds.Basic;

import java.util.Scanner;

public class multiplyTwoLargestNum {
	
	 static void moduloMultiplication() {
		 long a ;
	     long b ;
	     long sum ;
	     sum = 0;
	        Scanner sc = new Scanner(System.in);
	        a = sc.nextLong();
	        b = sc.nextLong();
	        for(long i=1;i<=a;i++) {
	         sum = sum+b;
	        }
	        System.out.println("the multiplication of the two Number is " + sum);
	 }
	public static void main(String[] args) {
		moduloMultiplication();
		
        
	}
}
