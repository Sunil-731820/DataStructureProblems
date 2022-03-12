package com.java.ds.LinkedList;

import java.util.*;
public class InsertingElementInLinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Sunil");
		System.out.println("the linked List of the array is ");
		System.out.println(linkedList);
		System.out.println("Enter the element to be inserted into the linkedlist");
		Scanner sc = new Scanner(System.in);
		String Str1 = sc.next();
		
		//Adding the element at the end of the linkedList
		linkedList.add(Str1);;
		System.out.println("the list after the insertion is ");
		
		//Showing the linkedList after inserting at the end of the list
		System.out.println(linkedList);
		
		
		
		
	}

}
