package com.java.ds.Array.LeetCodeOfArray;

import java.util.Scanner;

public class ProductOfArrayExceptItsSelf {
	
	static void  productOfArrayExceptItsSelf(int size, int[] arr) {
		
//		Creating Some Memory To Get hold The Studpid Data 
		int[] left = new int[size];
		int[] right = new int[size];
		int[] product = new int[size];
	
//		The Left Most value is 
		left[0] = 1;
//		The Right Most value is 
		right[size-1] = 1;
		
		 /* Construct the left array */
        for (int i = 1; i < size; i++)
            left[i] = arr[i - 1] * left[i - 1];
 
		System.out.println("The Left Side Array is");
		for(int i=0;i<size;i++) {
			System.out.println(left[i]);
		}
		
//		Constructing The Right hand Side 
		/* Construct the right array */
        for (int j = size - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];
		System.out.println("The Right hand Side Of The Array is ");
		for(int i=0;i<size;i++) {
			System.out.println(right[i]);
		}
		
//		Finding The product of The left And Right Sider Of The Array is 
		for(int k=0;k<size;k++) {
			product[k] = left[k] * right[k];
		}
		System.out.println("The product of The Array is Except ItSelf is ");
		for(int i=0;i<size;i++) {
			System.out.println(product[i]);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Product Of The Array Except ItSelf");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The Element in the Array");
			arr[i] = sc.nextInt();
		}
		System.out.println("The Array is ");
		for(int j=0;j<size;j++) {
			System.out.println(arr[j]);
		}
		System.out.println("caling The Method Here To getA All the Product Except ItSelf");
		productOfArrayExceptItsSelf(size, arr);
		
	}

}
