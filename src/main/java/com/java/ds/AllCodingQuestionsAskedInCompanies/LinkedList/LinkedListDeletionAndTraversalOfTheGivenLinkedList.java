package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

class Node{
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	
}

class LinkedListDeletionOperation{
	
	Node head;
	
//	First Push the Element at the Front Locations Some Element to Traverse The Given LinkedList
	  void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
//	This is for Printing The Given Linked List 
    void printTheGivenLinkedList() {
		Node node = head;
		while(node !=null) {
			System.out.print(node.data + " ->");
			node = node.next;
		}
		System.out.println("NULL");
	}
    
//    This is for the Deleting The Element From The LinkedList 
    void deleteAnElementFromTheLinkedList() {
    	
    }
}

public class LinkedListDeletionAndTraversalOfTheGivenLinkedList {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The LinkedListDeletionAndTraversalOfTheGivenLinkedList ");
		LinkedListDeletionOperation delAndTrv = new LinkedListDeletionOperation();
		delAndTrv.push(12);
		delAndTrv.push(20);
		delAndTrv.printTheGivenLinkedList();
	}

}
