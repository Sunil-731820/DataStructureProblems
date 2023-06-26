package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

import java.util.Scanner;

public class TakingTheInputFromTheUserInTheLinkedListAndThenStartTraversing {
	
	static class Node{
		int value;
		Node next;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of TakingTheInputFromTheUserInTheLinkedListAndThenStartTraversing");
		
//		So Initially The Linked List is Empty 
		
		Node head = null;
		Node firstValue = null;
		Node secondValue = null;
		Node thirdValue = null;
		
//		Memory Allocation using Heap 
		
		firstValue = new Node();
		secondValue = new Node();
		thirdValue = new Node();
		
//		Assigning The Input Value From The User Choice
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Node ");
		int size = sc.nextInt();
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter The Element In The LinkedList ");
//			int input = sc.nextInt();
//			firstValue.value = input;
//			
//		}
		
		System.out.println("Enter The Element In The LinkedList ");
		int input = sc.nextInt();
		firstValue.value = input;
		
		System.out.println("Enter The Element In The LinkedList ");
		int input1 = sc.nextInt();
		secondValue.value = input1;
		
		System.out.println("Enter The Element In The LinkedList ");
		int input2 = sc.nextInt();
		thirdValue.value = input2;
		
		
		
		
//		Making The Link With The Given Node 
		
		firstValue.next = secondValue;
		secondValue.next = thirdValue;
		thirdValue.next = null;
		
//		Displaying The Linked List 
		head = firstValue;
//		System.out.print(head.value); Head and First value is Same Here 
		while(head !=null) {
			System.out.print(head.value + " ->");
			head = head.next;
		}
		System.out.print("Null");
		
		
		
		
	}

}
