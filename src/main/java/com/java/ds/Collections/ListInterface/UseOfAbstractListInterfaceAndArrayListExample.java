package com.java.ds.Collections.ListInterface;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UseOfAbstractListInterfaceAndArrayListExample {
	public static void main(String[] args) {
		System.out.println("This is the Example Of The Use of The Abstract List ");
		AbstractList<String> abstractListData = new ArrayList<String>();
		abstractListData.add("Geeks");
		abstractListData.add("For");
		abstractListData.add("Geeks");
		System.out.println("The Abstract List data is ");
		System.out.println(abstractListData);
		
//		1 : Use Of The Add() 
		abstractListData.add("Lanaguge");
		System.out.println(abstractListData);
		abstractListData.add(0, "GFG");
		System.out.println(abstractListData);
		
//		2 : use Of The remove() 
		abstractListData.remove(0);
		System.out.println("After Removing The Abstrcat List is ");
		System.out.println(abstractListData);
		
//		3 : use Of The addAll() 
		AbstractList<String> list1 = new ArrayList<String>();
		list1.add("number1");
		list1.add("Number2");
		list1.add("number3");
		System.out.println("The Another List is : ");
		System.out.println(list1);
		System.out.println("After Adding The list1 into First List is :");
		abstractListData.addAll(list1);
		System.out.println("The Whole List data is : ");
		System.out.println(abstractListData);
		
//		Again Doing The Same Things Again 
		list1.addAll(abstractListData);
		System.out.println("The List1 is after adding teh abstract List into it ");
		System.out.println(list1);
		
//		4 : use of The Iterator() 
		Iterator itr = list1.iterator();
		while(itr.hasNext()) {
			System.out.println("The Object is : "+itr.next());
		}
		
//		5 : Use Of The ListIterator in java 
		AbstractList<String> newListOfData = new ArrayList<String>();
		newListOfData.add("Geeks");
		newListOfData.add("For");
		newListOfData.add("Geeks");
		newListOfData.add("10");
		newListOfData.add("20");
		System.out.println("The New List fo The data is : ");
		System.out.println(newListOfData);
		System.out.println("After the use of The listIterator Method : ");
		ListIterator itr1 = newListOfData.listIterator(2);
		while(itr1.hasNext()) {
			System.out.println("The Tracking Of The Object Starting at the Index 2 is "+ itr1.next());
		}
		
	}

}
