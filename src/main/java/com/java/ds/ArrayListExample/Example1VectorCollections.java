package com.java.ds.ArrayListExample;

import java.util.Vector;

public class Example1VectorCollections {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<>();
		vc.add("Sunil");
		vc.add("Harish");
		vc.add("Suman");
		vc.add("khushboo");
		vc.add("subham");
		for (String vc1 : vc) {
			System.out.print(vc1+ " ");
		}
	}

}
