package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

public class LinkedListCreationAndTraversal {
	
	static class Node{
		int value ;
		Node next;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Linked List Creation And Cfeations ");
		
//		Initially The Linked List Node Should Be Null So 
		
		Node head = null;
		Node firstValue = null;
		Node secondValue = null;
		Node ThirdValue = null;
		
//		Memory Allocation using Heap 
		
		firstValue = new Node();
		secondValue = new Node();
		ThirdValue = new Node();
		
//		Assigning The Value To The Given Node 
		
		firstValue.value = 12;
		secondValue.value = 20;
		ThirdValue.value = 40;
		
//		Linking The Given Node With Link 
		
		firstValue.next = secondValue;
		secondValue.next = ThirdValue;
		ThirdValue.next = null;
		
//		Displaying The Linked List One By One Through The Arrow -> 
		
		head = firstValue;
		while(head !=null) {
			System.out.print(head.value + "->");
			head = head.next;
		}
		
	}

}
