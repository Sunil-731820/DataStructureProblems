package com.java.ds.String;

public class ArmStrongNum {
	public static void main(String[] args) {
		int number , rem ,sum=0;
		number = 1;
		int saveNum = number;
		while(number!=0) {
			rem = number%10;
			sum = sum + rem*rem*rem;
			number = number/10;
		}
		if(saveNum==sum) {
			System.out.println("the Number is palindrome");
		}else {
			System.out.println("the Number is Not Palindrome");
		}
	}

}
