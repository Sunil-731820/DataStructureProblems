package com.java.ds.hashSets;

import java.util.HashSet;
import java.util.Scanner;

public class ExampleHashSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
//		now adding the element to the hashset
		hs.add("Sunil");
		hs.add("Harish");
		hs.add("Suman");
		hs.add("Sunil");
		System.out.println("the hashsets is ");
		System.out.println(hs);

	}

}
