package com.java.ds.Basic;

import java.util.Scanner;

public class multiplyTwoLargestNum {
	
	 public static Long moduloMultiplication() {
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
//	        System.out.println("the multiplication of the two Number is " + sum);
	        return sum;
	 }
	public static void main(String[] args) {
		Long res = moduloMultiplication();
		System.out.println(res);
		
        
	}
}
