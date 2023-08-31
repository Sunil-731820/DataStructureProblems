package com.java.ds.Collections.ListInterface;

import java.util.ArrayList;
import java.util.ListIterator;

class AllFunctionality {
	
	static void getAllFunctionality() {
		System.out.println("This is The Example of the get all functionality of The Array List");
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(100);
		listOfIntegers.add(200);
		listOfIntegers.add(300);
		listOfIntegers.add(400);
		System.out.println("The Array List With data is ");
		System.out.println(listOfIntegers);
		
//		Creating The Another Array List
		ArrayList<Integer> listOfSecondInteger = new ArrayList<Integer>();
		listOfSecondInteger.add(1000);
		listOfSecondInteger.add(2000);
		listOfSecondInteger.add(3000);
		listOfSecondInteger.add(4000);
		System.out.println("The Another Array List is ");
		System.out.println(listOfSecondInteger);
		
//		1 : use Of AddAll() 
		System.out.println("After Adding The First Array List into The Second Array List ");
		listOfIntegers.addAll(listOfSecondInteger);
		System.out.println("The Array List is After Additions is : ");
		System.out.println(listOfIntegers);
		
//		2 : Use of The AddAll() At The Given Index
		System.out.println("Before The Array List is ");
		System.out.println(listOfIntegers);
		
//		Creating The Third Array List is : 
		ArrayList<Integer> thirdList = new ArrayList<Integer>();
		thirdList.add(201);
		thirdList.add(301);
		thirdList.add(401);
		thirdList.add(501);
		System.out.println("The third List is ");
		System.out.println(thirdList);
		System.out.println("After The use Of The addAll Method At Given index is ");
		listOfIntegers.addAll(0, thirdList);
		System.out.println(listOfIntegers);
		
//		3 : Use of the CLone Method : 
		ArrayList<Integer> cloneList = new ArrayList<Integer>();
		cloneList = (ArrayList<Integer>) listOfIntegers.clone();
		System.out.println("The Array List After CLoning is : ");
		System.out.println(cloneList);
		
//		4 : use of The listIterator Method 
		ArrayList<Integer> listOfNumber = new ArrayList<Integer>();
		listOfNumber.add(20102);
		listOfNumber.add(30201);
		listOfNumber.add(40031);
		listOfNumber.add(20102);
		listOfNumber.add(30201);
		listOfNumber.add(40031);
		System.out.println("The Array List is ");
		System.out.println(listOfNumber);
		ListIterator<Integer> list = listOfNumber.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next());
		}
		
//		Again The Use Of The ListIterator
		System.out.println("Again The Use Of The ListIterator Method :");
		ListIterator<Integer> list1 = listOfNumber.listIterator(2);
		while(list1.hasNext()) {
			System.out.println(list1.next());
		}
		
	}
	
}

public class UseOfArrayListExample {
	public static void main(String[] args) {
		AllFunctionality allFunctionality = new AllFunctionality();
		allFunctionality.getAllFunctionality();
	}

}
