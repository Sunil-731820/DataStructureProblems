package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class FindTheEquilibriumPointsInGivenArray {
	static int  getFindTheEquilibriumPointsInGivenArray(int[] arr ,int size) {
		for(int i=0;i<size;i++) {
			
//			Calculating The left Sum In the Array 
			int leftSum = 0;
			for(int j=0;j<size;j++) {
				leftSum +=arr[j];
			}
			
			int rightSum = 0;
			for(int k=i+1;k<size;k++) {
				rightSum +=arr[k];
			}
			
			if(leftSum==rightSum) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The FindTheEquilibriumPointsInGivenArray ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array is ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element of The Array ");
			arr[i] = sc.nextInt();
		}
		int index = getFindTheEquilibriumPointsInGivenArray(arr, size);
		System.out.println("The Index is : "+ index);
	}

}
