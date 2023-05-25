package com.java.ds.Array.LeetCodeOfArray;

public class ProductOfArrayExceptItsSelf {
	
	static int[] productOfArrayExceptItsSelf(int size, int[] inputArray, int[] outputArray) {
		int totalProduct = 1 ;
		int safeIndex ;
		for(int i=0;i<size;i++) {
			safeIndex = inputArray[i];
			for(int j=i+1;j<size;j++) {
				totalProduct = totalProduct*inputArray[j];
				outputArray[j] = totalProduct;
			}
		}
		return outputArray;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Product Of The Array Except ItSelf");
		
	}

}
