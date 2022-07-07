package com.java.ds.ArrayListExample;

import java.util.PriorityQueue;

public class Example1PriorityQueueCollections {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Sunil");
		queue.add("Harish");
		queue.add("Khushboo");
		System.out.println("head"+ queue.element());
		queue.add("Sunil");
		queue.add("Arti");
		System.out.println("head " + queue.element());
		System.out.println("after removing the element from the queue");
		System.out.println(queue.remove());
 	}

}
