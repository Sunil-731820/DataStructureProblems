package com.java.ds.bitManipulations;

import java.util.HashSet;
import java.util.Scanner;

public class NonTwoRepeatingElementInArray {
	
	public static void nonRepeating(int[] arr, int size) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0;i<size;i++) {
			if(s.contains(arr[i])) {
				s.remove(arr[i]);
			}else {
				s.add(arr[i]);
			}
		}
		System.out.println("the non repreating element is ");
		for (int it : s) {
			System.out.print(it + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element in the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("the element of the array is ");
		for(int j=0;j<size;j++) {
			System.out.print(arr[j]+ " ");
		}
		nonRepeating(arr, size);
	}

}
