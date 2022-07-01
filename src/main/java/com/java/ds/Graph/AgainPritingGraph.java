package com.java.ds.Graph;

import java.util.ArrayList;

public class AgainPritingGraph {
	
	public static void AddEdge(ArrayList<ArrayList<Integer>> adj ,int u , int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		for(int i=0;i<adj.size();i++) {
			System.out.println("Adjacency list of the arrays is " + i);
			System.out.print("head");
			for(int j=0;j<adj.get(i).size();j++) {
				System.out.println("- > "+ adj.get(i).get(j));
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int V = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<Integer>());
			
		}
		
		AddEdge(adj, 0, 1);
		AddEdge(adj, 0, 4);
		AddEdge(adj, 1, 2);
		AddEdge(adj, 1, 3);
		AddEdge(adj, 1, 4);
		AddEdge(adj, 2, 3);
		AddEdge(adj, 3, 4);
		printGraph(adj);
		
	}

}
