package com.java.ds.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchAlgorithms {
	private int V;
	private LinkedList<Integer> adj[];
	private Queue<Integer> queue;
	
	BreadthFirstSearchAlgorithms(int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
		queue = new LinkedList<Integer>();
	}
	
	void addEdge(int v , int w) {
		adj[v].add(w);
	}
	
	void BFS(int n) {
		
	}
	public static void main(String[] args) {
		System.out.println("hello");
		
	}

}
