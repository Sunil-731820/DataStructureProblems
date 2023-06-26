package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

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
	
	void printListOfTheLinkedList() {
		Node node = head;
		while(node!=null) {
			System.out.print(node.data + " ->");
			node = node.next;
		}
		System.out.print("NULL");
	}
}

public class LinkedListInsertionWithDifferentPoints {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The LinkedListInsertionWithDifferentPoints ");
		LinkedList list = new LinkedList();
		list.push(12);
		list.push(23);
		list.push(34);
		list.printListOfTheLinkedList();
	}

}
