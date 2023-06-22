package com.java.ds.AllCodingQuestionsAskedInCompanies.Arrays;

import java.util.Scanner;

public class RearrangeTheArrayAccordingToFirstMaxAndFirstMinAndSoOn {

	static void sortTheDataInAscendingOrdrer(int[] arr, int size) {
		for (int i = 0 + size / 2; i < arr.length; i++) {
			for (int j = size / 2; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0 + size / 2; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void sortTheDataInDescendingOrdrer(int arr[], int size) {
		for (int i = 0; i < size; i++) {
			for (int j = i; j < size; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting the Array is ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static void getRearrangeTheFirstmaxAndfirstMinAndSoOn(int[] arr, int size) {
		sortTheDataInDescendingOrdrer(arr, size);
		int[] tempArray1 = new int[size];
		int[] tempArray2 = new int[size];

		for (int i = 0; i < size / 2; i++) {
			tempArray1[i] = arr[i];
		}
		System.out.println("the First Temp Array is : ");
		for (int i = 0; i < size / 2; i++) {
			System.out.print(tempArray1[i] + " ");
		}
		for (int i = size / 2; i < arr.length; i++) {
			tempArray2[i] = arr[i];
		}
		System.out.println("the Second array is ");
		for (int i = 0 + size / 2; i < arr.length; i++) {
			System.out.print(tempArray2[i] + " ");
		}
//	Again Calling the Sorting method To Sort the data In Ascending Order
		System.out.println();
		System.out.println("Again Sorting the Temp Array is ");
		sortTheDataInAscendingOrdrer(tempArray2, tempArray2.length);
		System.out.println("The Data In Second temp Array is ");
		for (int i = 0; i < tempArray2.length; i++) {
			System.out.print(tempArray2[i] + " ");
		}
		System.out.println("The length of The Second temp Array is " + tempArray2.length);
		for (int i = 0; i < tempArray2.length; i++) {
			for (int j = i; j < tempArray2.length; j++) {
				if (tempArray2[i] > tempArray2[j]) {
					int temp = tempArray2[i];
					tempArray2[i] = tempArray2[j];
					tempArray2[j] = temp;
				}
			}
		}
		System.out.println("the First Temp Array is : ");
		System.out.println("After Sorting the Array is :");
		for (int i = 0; i < size / 2; i++) {
			System.out.print(tempArray1[i] + " ");
		}

		for (int i = size / 2; i < tempArray2.length; i++) {
			System.out.print(tempArray2[i] + " ");
		}
		int newSizeOfTheArray = tempArray1.length + tempArray2.length;
		int[] newArray = new int[newSizeOfTheArray];
		System.out.println("The new Size of The Array is  : " + newSizeOfTheArray);
		for (int i = 0; i < tempArray1.length; i++) {
			newArray[i] = tempArray1[i];
		}
		System.out.println("The NEw Array is ");
		for (int i = 0; i < newArray.length / 4; i++) {
			System.out.print(newArray[i] + " ");
		}
		for (int j = 0; j < tempArray2.length; j++) {
			newArray[j + tempArray2.length] = tempArray2[j];
		}
		System.out.println("After And Again the New Array is : ");
		for (int j = 0 + newArray.length / 4; j < newArray.length; j++) {
			System.out.print(newArray[j] + " ");
		}
		System.out.println("After Concatenation of The Array is ");
		for (int i = 0; i < newSizeOfTheArray; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("this is The Example Of The RearrangeTheArrayAccordingToFirstMaxAndFirstMinAndSoOn ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of The Array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Element In the Array is ");
			arr[i] = sc.nextInt();
		}
		getRearrangeTheFirstmaxAndfirstMinAndSoOn(arr, size);
	}

}
