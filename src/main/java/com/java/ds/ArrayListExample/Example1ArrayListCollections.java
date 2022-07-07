package com.java.ds.ArrayListExample;

import java.util.ArrayList;

public class Example1ArrayListCollections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sunil");
		list.add("Harish");
		list.add("suman");
		list.add("khushboo");
		list.add("Sunil");
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
