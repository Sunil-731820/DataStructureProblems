package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

public class SecondExampleOfLinkedList {
	
	static class Node{
		int value;
		Node next;
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of THe LinkedList ");
		
//Step 1 : 		Initially The Linked List Is NUll
		Node head = null;
		Node one = null;
		Node two = null;
		Node three = null;
		Node fourth = null;
		
//Step 2 : 		Memory Allocating By Heap 
		
		one = new Node();
		two = new Node();
		three = new Node();
		fourth = new Node();
		
//Step 3 : 		Assigning The Value To The Given Node 
		one.value = 1;
		two.value = 2;
		three.value = 3;
		
		
//Step 4 : 		Now Its Time for Adding The Linked With Given Value and Pointer 
		
		 one.next = two;
		 two.next = three;
		 three.next = null;
		
//Step 5 : 		Printing The Linked List Values 
		
		head  = one;
		while(head!=null) {
			System.out.print(head.value + " -> ");
			head = head.next;
		}
	}

}
