package com.java.ds.ArrayListExample;

import java.util.LinkedHashSet;

public class Example1LinkedhashSetCollections {
	public static void main(String[] args) {
		LinkedHashSet<String> st = new LinkedHashSet<>();
		st.add("Sunil");
		st.add("mom");
		st.add("Subham");
		st.add("Arti");
		st.add("Suman");
		System.out.println("the linkedlistHashSets is ");
		System.out.println(st);
		System.out.println("removing the element by name ");
		System.out.println(st.remove("Sunil"));
		System.out.println(st);
	}

}
