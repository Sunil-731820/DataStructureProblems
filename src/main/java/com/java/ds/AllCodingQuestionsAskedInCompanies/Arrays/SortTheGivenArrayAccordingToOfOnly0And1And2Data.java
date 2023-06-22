package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class SortTheGivenArrayAccordingToOfOnly0And1And2Data {

	static void sortTheGivenArrayInAscedingOrder(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The Sorted Array is ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("this is The Example Of The SortTheGivenArrayAccordingToOfOnly0And1And2Data ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter The Element In The Array is : ");
			arr[i] = sc.nextInt();
		}
		sortTheGivenArrayInAscedingOrder(arr, size);
	}

}
