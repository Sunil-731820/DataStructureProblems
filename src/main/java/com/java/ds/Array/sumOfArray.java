package com.java.ds.Array;

public class sumOfArray {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8};
		for (int i : num) {
			System.out.println("The element one By One is " + i);
		}
		System.out.println("finding the sum of the array is ");
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum = sum +num[i];
		}
		System.out.println("the sum of the array is " + sum);
	}

}
