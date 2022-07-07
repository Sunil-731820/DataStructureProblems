package com.java.ds.ArrayListExample;

import java.util.Stack;

public class Example1StackCollections {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		st.push("Sunil");
		st.push("Arti");
		st.push("subham");
		st.push("Harish");
		for (String string : st) {
			System.out.println(string);
		}
		System.out.println("after poping the last element from the stack ");
		System.out.println(st.pop());
	
	}

}
