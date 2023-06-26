package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

public class FirstExampleOfLinkedList {
	static class Node{
		int value;
		Node next;
		
	}
	public static void main(String[] args) {
		System.out.println("This is The First Example Of The LinkedList ");
		
		Node head = null;
		Node first = null;
		Node second = null;
		Node third = null;
		
//		Allocating The Memory In The Heap 
		first = new Node();
		second = new Node();
		third = new Node();
		
//		Assigning The Value To The Node 
		first.value = 1;
		second.value = 2;
		third.value = 3;
		
//		Mapping With Address And Value To The Given Node 
		
		first.next = second;
		second.next = third;
		third.next = null;

//		Print The LinkedLIst Value 
		head = first;
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

}
