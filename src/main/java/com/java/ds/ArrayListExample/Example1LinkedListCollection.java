package com.java.ds.ArrayListExample;

import java.util.LinkedList;

public class Example1LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<String> lk = new LinkedList<>();
		lk.add("Sunil");
		lk.add("Harish");
		lk.add("Suman");
		lk.add("khushboo");
		for (String link : lk) {
			System.out.print(link+ " ->");
		}
		System.out.print("NULL");
		
	}

}
