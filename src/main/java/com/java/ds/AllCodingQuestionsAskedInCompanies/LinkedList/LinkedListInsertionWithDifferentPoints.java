package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

import java.util.Scanner;

class Node{
	
	int data;
    Node next;
    
	public Node(int data) {
		super();
		this.data = data;
		next = null;
	}
    
    
	
	
}

class LinkedList{
	Node head;
	
//	1 :Adding The Node At The First Position Of The LinkedList 
	
	void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head==null) {
			head = new_node;
			return;
		}
		else {
			Node last = head;
			while(last.next!=null) {
				last = last.next ;
			}
			last.next = new_node;
		}
		
	}
	
//	Displaying The Linkedlist 
	void printListOfTheLinkedList() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data + " ->");
			node = node.next;
		}
		
	}
}

public class LinkedListInsertionWithDifferentPoints {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The LinkedListInsertionWithDifferentPoints ");
		LinkedList list = new LinkedList();
//		list.push(12);
//		list.push(23);
//		list.push(34);
		list.printListOfTheLinkedList();
		Scanner sc = new Scanner(System.in);
//		Taking The user Input 
//		System.out.println("Example Of Taking This Input from The User ");
//		System.out.println("ENter The Size of The linkedList ");
//		int size = sc.nextInt();
//		for(int i=0;i<size;i++) {
//			System.out.println("Enter The New Node In The Given linked List");
//			int number = sc.nextInt();
//			list.push(number);
//		}
//		list.printListOfTheLinkedList();
		
//		Appending the Linked List node At The End of The Given LinkedList 
		list.append(21);
		list.append(23);
		list.printListOfTheLinkedList();
	}

}
