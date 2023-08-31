package com.java.ds.Collections.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class UseOfListInterfaceAndArrayList {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The List Interface and Array List ");
		List<Integer> listOfNumber = new ArrayList<Integer>();
		listOfNumber.add(100);
		listOfNumber.add(200);
		listOfNumber.add(300);
		listOfNumber.add(0,500);// This Will Add the data At The 0 Index And Value is 500 
		System.out.println("The Array List of The Number is : ");
		System.out.println(listOfNumber);
		
		List<Integer> listOfOtherNumbers = new ArrayList<Integer>();
		listOfOtherNumbers.add(2000);
		listOfOtherNumbers.add(30000);
		System.out.println("The List of The Other Number is ");
		System.out.println(listOfOtherNumbers);
//		 Use of the addAll method 
		listOfOtherNumbers.addAll(0,listOfNumber);
		System.out.println("After Adding the List of The Number at The Index 0 is ");
		System.out.println(listOfOtherNumbers);
//		Remove the Element from The Index 1 is  : 
		System.out.println(listOfOtherNumbers.remove(1));
		System.out.println("The Array List After removing The object from 1 is ");
		System.out.println(listOfOtherNumbers);
//		Printing The ELement from The Index 3 using get method 
		System.out.println("The Element At The Index3 using Get Method is ");
		System.out.println(listOfOtherNumbers.get(3));
		
//		Replacing The 0th Element With Other value
		System.out.println("Before The List is ");
		System.out.println(listOfOtherNumbers);
		listOfOtherNumbers.set(0,10000);
		
		System.out.println("After The List is : ");
		System.out.println(listOfOtherNumbers);
		
//		for String Objects : 
		List<String> listOfTheStringObjects = new ArrayList<String>();
		listOfTheStringObjects.add("Geeks");
		listOfTheStringObjects.add("For");
		listOfTheStringObjects.add("Geeks");
		System.out.println("The List Of The String Objects is :");
		System.out.println(listOfTheStringObjects);
//		Adding One Object Using add() 
		listOfTheStringObjects.add(0,"Language");
		System.out.println("After Addition The List of the String Object is");
		System.out.println(listOfTheStringObjects);
//		updating The List of The Objects 
		listOfTheStringObjects.set(1, "GeeksforGeeks:");
		System.out.println("After upadting The List Of The objects is : ");
		System.out.println(listOfTheStringObjects);
//		Searching for elements 
		int value = listOfTheStringObjects.indexOf("GeeksforGeeks");
		System.out.println("The Index is : ");
		System.out.println(value);
//		Removing Elements
		System.out.println("After Removing The Element from The List ");
		System.out.println(listOfTheStringObjects.remove(0));
		System.out.println("The List is Aftre Removing the Objcets ");
		System.out.println(listOfTheStringObjects);
//		Accessing The Element Using Get Method : 
		String FirstELement = listOfTheStringObjects.get(0);
		System.out.println("The First Element is ");
		System.out.println(FirstELement);
		String secondELement = listOfTheStringObjects.get(1);
		System.out.println("The Second Element is : ");
		System.out.println(secondELement);
//		Checking if an element is present in the List
		System.out.println("The Array List is ");
		System.out.println(listOfTheStringObjects);
		boolean find = listOfTheStringObjects.contains("for");
		if(find==true) {
			System.out.println("The Element Is Found In teh Arary List"+find);
		}else {
			System.out.println("The Element is Not found In the Array List "+find);
		}
//		Its time for the Iteration  
		System.out.println("The List of The Array is After using for loop  ");
		for(int i=0;i<listOfTheStringObjects.size();i++) {
			System.out.print(i + " "+ listOfTheStringObjects.get(i)+ " ");
		}
		System.out.println("\nAfter The Use Of The for Each Loop is \n");
//		Use of the For Each Loop for Iterations 
		for (String string : listOfTheStringObjects) {
			System.out.println(string);
		}
//		Use Of The Sort method : 
		System.out.println("Before Sorting The List of The Array is ");
		System.out.println(listOfTheStringObjects);
		listOfTheStringObjects.sort(null);
		System.out.println("The List of The Array After Sorting ");
		System.out.println(listOfTheStringObjects);
//		Use Of The Equals Method : 
		System.out.println("The List Before Comparing The Objects ");
		System.out.println(listOfTheStringObjects);
		String name = "For";
		if(listOfTheStringObjects.equals("For")) {
			System.out.println("The Element is There in the List of The Objects "+name);
		}else {
			System.out.println("The Element is NoT tThere in the Array Of The List "+name);
		}
		List<String> AnotherList = new ArrayList<String>();
		AnotherList.addAll(listOfTheStringObjects);
		System.out.println("The New List of The Objects is : ");
		System.out.println(AnotherList);
		AnotherList.add("Sunil");
		if(listOfTheStringObjects.equals(AnotherList)) {
			System.out.println("Yes Both The List of The Object is Same With COntent ");
		}else {
			System.out.println("No Different One ");
		}
//		Use Of the isEmpty Method : 
		System.out.println("The Array List is : ");
		System.out.println(AnotherList);
		System.out.println("After The USe Of The isEmpty() Method : ");
		System.out.println(AnotherList.isEmpty());
		if(AnotherList.isEmpty()) {
			System.out.println("The List of The object is Empty");
		}else {
			System.out.println("Not Empty ");
		}
		
	}

}
