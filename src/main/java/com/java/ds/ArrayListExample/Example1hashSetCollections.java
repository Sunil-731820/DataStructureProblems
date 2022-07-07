package com.java.ds.ArrayListExample;

import java.util.HashSet;
import java.util.Set;

public class Example1hashSetCollections {
	public static void main(String[] args) {
		HashSet<String> st = new HashSet<>();
		st.add("Sunil");
		st.add("Harish");
		st.add("harish");
		st.add("Sunil");
		st.add("sunil");
		st.add("amaresh");
		System.out.println("the set is ");
		System.out.println(st);
		
	}

}
