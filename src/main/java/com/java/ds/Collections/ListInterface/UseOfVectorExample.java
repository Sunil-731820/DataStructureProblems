package com.java.ds.Collections.ListInterface;

import java.util.Enumeration;
import java.util.Vector;

public class UseOfVectorExample {
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Vector ");
		Vector<String> listOfVector = new Vector();
		listOfVector.add("geeks");
		listOfVector.add("for");
		listOfVector.add("geeks");
		System.out.println("The List Odf The Vector is ");
		System.out.println(listOfVector);
		
//		Adding The Elemnt At The end Of The Vector : 
		listOfVector.add("10");
		System.out.println("After The Use Of The Add()");
		System.out.println(listOfVector);
		
//		The use of add() With index 
		listOfVector.add(0, "Harish");
		System.out.println("After The Use Of The List Of vector is : ");
		System.out.println(listOfVector);
		
//		use Of AddAll() 
		Vector<String> listOfData = new Vector();
		listOfData.add("Kumar");
		listOfData.add("Gupta");
		System.out.println("The List of Other Vector is ");
		System.out.println(listOfData);
		System.out.println("After The Use Of The AddAll() ");
		listOfVector.addAll(listOfData);
		System.out.println("The List Of The vector is : ");
		System.out.println(listOfVector);
		
//		The Use of AddAll() With Index 
		Vector<String> thirdVector = new Vector();
		thirdVector.add("100");
		thirdVector.add("200");
		thirdVector.add("300");
		System.out.println("The Third Vector is ");
		System.out.println(thirdVector);
		
		System.out.println("After The Use Of The AddAll() With Index is : ");
		listOfVector.addAll(0, thirdVector);
		System.out.println("The List o The Vector is ");
		System.out.println(listOfVector);
		
//		The Use of capacityMethod 
		System.out.println(listOfVector.capacity());
		
//		The Use of The CopyInto() 
		Vector<String> vec = new Vector();
		vec.add("3000");
		vec.add("4000");
		vec.add("5000");
		System.out.println("The vector is ");
		System.out.println(vec);
		
//		Creating The Array 
		String[] arr = new String[6];
		arr[0] = "Hello";
		arr[1] = "Bye";
		System.out.println("The Array of The String is ");
		System.out.println(arr);
		
		System.out.println("After The use Of The CopyInto Method ");
		vec.copyInto(arr);
		System.out.println("The Vector is ");
		System.out.println(vec);
		// Creating an empty Vector
        Vector<String> vec_tor = new Vector<String>();
 
        // Use add() method to add elements into the Vector
        vec_tor.add("Welcome");
        vec_tor.add("To");
        vec_tor.add("Geeks");
        vec_tor.add("4");
        vec_tor.add("Geeks");
 
        // Displaying the Vector
        System.out.println("Vector: " + vec_tor);
 
        // Creating an array
        String arr1[] = new String[6];
 
        arr1[0] = "Hello";
        arr1[1] = "World";
 
        // Displaying the initial array
        System.out.println("The initial array is: ");
        for (String str : arr1)
            System.out.println(str);
 
        // Copying
        vec_tor.copyInto(arr1);
 
        // The final array
        System.out.println("The final array is: ");
        for (String str : arr1)
            System.out.println(str);
        
//        The use of elementAt() Method 
        System.out.println("The Element At The Index 0 is");
        System.out.println(vec_tor.elementAt(0));
        
//        Use Of The elements() 
        Vector<String> listOfVector1 = new Vector();
        listOfVector1.add("Laptop");
        listOfVector1.add("DELL");
        listOfVector1.add("HP");
        listOfVector1.add("MAc");
        System.out.println("The List of vector is ");
        System.out.println(listOfVector1);
        System.out.println("After The Use of The elements() ");
        Enumeration<String> listOfEnumerations = listOfVector1.elements();
        System.out.println("The List of The Enumerations is after the use of elements() ");
        System.out.println(listOfEnumerations);
//        while(listOfEnumerations.hasMoreElements()) {
//        	System.out.println(listOfEnumerations.hasMoreElements());
//        }
        // Creating an empty Vector
        Vector<Integer> vec_tor1 = new Vector<Integer>(5);
 
        // Inserting elements into the table
        vec_tor1.add(10);
        vec_tor1.add(15);
        vec_tor1.add(20);
        vec_tor1.add(25);
        vec_tor1.add(30);
 
        // Displaying the Vector
        System.out.println("The Vector is: " + vec_tor1);
 
        // Creating an empty enumeration to store
        Enumeration enu = vec_tor1.elements();
 
        System.out.println("The enumeration of values are:");
 
        // Displaying the Enumeration
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
	}

}
