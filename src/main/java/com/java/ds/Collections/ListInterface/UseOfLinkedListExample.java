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
		
//		11 : use of the element() 
		System.out.println("After The use of The element() ");
		int value = linkedList.element();
		System.out.println("After The Head value form The Given LinkedList is ");
		System.out.println(value);
		
		int secondValue = linkedList.element();
		System.out.println("The Second Value is : ");
		System.out.println(secondValue);
//		12 : use of The getIndex() 
		System.out.println("The LinkedList is Before The Use Of The getIndex Method ");
		System.out.println(linkedList);
		System.out.println("After The Use Of The getIndex Method : ");
		System.out.println(linkedList.get(6));
		
//		13 : Use of The getFirst() 
		System.out.println("After The use of The getFirst method : ");
		System.out.println(linkedList.getFirst());
		
//		14 : use of The getLast()
		System.out.println("After the use of The getLast method : ");
		System.out.println(linkedList.getLast());
		
//		15 : use of indexOf() 
		System.out.println("After The use of The IndexOf method ");
		System.out.println(linkedList.indexOf(300));
		
//		16 : Use of The lastIndexOf() 
		System.out.println("After The Use Of The LastIndeOf Method : ");
		System.out.println(linkedList.lastIndexOf(300));
		
//		17 : Use Of The listIterator () 
		System.out.println("After The use Of The List Iterator ");
		Iterator<Integer> itr1 = linkedList.listIterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
//		18 : Use of The Offer() 
		System.out.println("After The Adding The Element At the Last using Offer method : ");
		linkedList.offer(5000);
		System.out.println(linkedList);
		
//		19 : Use of The offerFirst() 
		System.out.println("After The Asdding the Element At The Front of The LinkedList using offerFist method ");
		linkedList.offerFirst(10000);
		System.out.println(linkedList);
		
//		20 : use Of The offerLast method 
		System.out.println("After The use Of The offerLast method : ");
		System.out.println(linkedList.offerLast(300000));
		System.out.println("The Size Of The Linked List is ");
		System.out.println(linkedList.size());
		linkedList.offerLast(900000);
		System.out.println("The LinedkList is After the additions : ");
		System.out.println(linkedList);
		System.out.println("the Size of The Linked List after Addinh The Data is ");
		System.out.println(linkedList.size());
		
//		21 use of peek() 
		System.out.println("After The use of The peek method : ");
		System.out.println(linkedList.peek());
//		22 use Of The peekFirst method : 
		System.out.println("After the use of The peeek First method : ");
		System.out.println(linkedList.peekFirst());
		
//		23 : use Of The PeekLast method : 
		System.out.println("Agfter the Use of The peek last method : ");
		System.out.println(linkedList.peekLast());
		
//		24 : Use Of tHe poll() 
		System.out.println("Before The use Of The Poll the Linked List data is ");
		System.out.println(linkedList);
		System.out.println("After The Use Of The poll Method : ");
		System.out.println(linkedList.poll());
		System.out.println("After The use of The Poll method the Linked List data is ");
		System.out.println(linkedList);
//		25 : Use Of The PollFirst() 
		System.out.println("Before The use Of The pollFirst method The data is : ");
		System.out.println(linkedList);
		System.out.println("After teh use Of The pollFirst method : ");
		System.out.println(linkedList.pollFirst());
		System.out.println("Afetr The Use Of The pollFirst method the Data is ");
		System.out.println(linkedList);
//		26 : use of The pollLast() 
		System.out.println("Before The Use Of The pollLast method The data ais : ");
		System.out.println(linkedList);
		System.out.println("After the Use of The polllast method : ");
		System.out.println(linkedList.pollLast());
		System.out.println("Aftre The Use Of The polLLast method data is : ");
		System.out.println(linkedList);
		
	}
	public static void main(String[] args) {
		System.out.println("This is the use of the Linked List");
		getAllFunctionalityOfTheLinkedList();
	}

}
