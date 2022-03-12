package com.java.ds.Basic;

import java.util.Scanner;

class LeapYear{
	public int Year() {
		System.out.println("Enter the year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("the Given Year is Leap Year" + year);
		}
		else {
			System.out.println("The Given Year is Not Leap Year " + year);
		}
		return year;
		
	}
}
public class LeapYearOrNot {
	public static void main(String[] args) {
		LeapYear obj1 = new LeapYear();
		 int res = obj1.Year();
		System.out.println("the Year  is  " + res);
		
	}
}
