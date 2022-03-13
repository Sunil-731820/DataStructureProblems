package com.java.ds.Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class RemoveDuplicate{
	public void remove() {
		System.out.println("Enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the element for the array");
			arr[i] = sc.nextInt();
		}
		System.out.println("priting the input element ");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i] + " ");
		}
		
		Set<Integer> duplicateElementRemove = new HashSet<Integer>();
		for(int j=0;j<size;j++) {
			duplicateElementRemove.add(arr[j]);
		}
		
		System.out.println("after removing the duplicate values ");
		System.out.println(duplicateElementRemove);
	}
}

public class DuplicateElementRemove {
	public static void main(String[] args) {
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.remove();
		
	}

}
