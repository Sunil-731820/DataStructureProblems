package com.java.ds.Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;

public class UseOfLinkedListExample {
	
	static void getAllFunctionalityOfTheLinkedList() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
//		1 : Use Of The Add() 
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		System.out.println("The Linked List is ");
		System.out.println(linkedList);
//		2 : use Of The Add() With Given Index 
		linkedList.add(0, 1000);
		System.out.println("After Adding the Data to The LinkedList is ");
		System.out.println(linkedList);
		
//		3 : Use Of AddAll() 
		LinkedList<Integer> secondLinkedList = new LinkedList<Integer>();
		secondLinkedList.add(0001);
		secondLinkedList.add(0002);
		secondLinkedList.add(0003);
		System.out.println("The Second Linked List is ");
		System.out.println(secondLinkedList);
		System.out.println("After The use Of AddAll() ");
		linkedList.addAll(secondLinkedList);
		System.out.println("The Whole Linked List Objects is ");
		System.out.println(linkedList);
		
//		4 : Use of the AddAll() With Given Index is 
		LinkedList<Integer> thirdList = new LinkedList<Integer>();
		thirdList.add(201);
		thirdList.add(301);
		System.out.println("The Third List is ");
		System.out.println(thirdList);
		System.out.println("After The Use Of The AddAll() With Give Index ");
		linkedList.addAll(0, thirdList);
		System.out.println(linkedList);
//		5 : User Of AddFirst() 
		linkedList.addFirst(90);
		System.out.println("After The Use Of The AddFirst() ");
		System.out.println(linkedList);
		
//		6 : use of the addLast() 
		linkedList.addLast(9000);
		System.out.println("After The Use Of The addLast() ");
		System.out.println(linkedList);
		
//		7 : use of the clone() 
		LinkedList<Integer> cloneList = new LinkedList<Integer>();
		cloneList = (LinkedList<Integer>) linkedList.clone();
		System.out.println("The CLone Object is ");
		System.out.println(cloneList);
		
//		8 : use of the contains() 
		System.out.println("After The use of the contains() ");
		System.out.println(cloneList.contains(linkedList));
		
//		9 : use of the containsAll() 
		System.out.println("After The Use of the containsAll()");
		System.out.println(cloneList.containsAll(linkedList));
		
//		10 : use of the descendingIterator() 
		System.out.println("After The Use of The descendingIterator()");
		Iterator<Integer> itr = linkedList.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+ "->");
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println("This is the use of the Linked List");
		getAllFunctionalityOfTheLinkedList();
	}

}
