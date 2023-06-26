package com.java.ds.AllCodingQuestionsAskedInCompanies.LinkedList;

import java.util.Scanner;

public class TheOtherWayToTakeTheInputFromTheUserInLinkedList {
	
	static class Node{
		int value ;
		Node next;
		
		public Node(int value) {
			this.value = value;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("This is The Example Of The TheOtherWayToTakeTheInputFromTheUserInLinkedList");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter The Node Values ");
			int input = sc.nextInt();
			Node n = new Node(input);
		}
		System.out.println("The Node After taking The Input From The User is ");
		
	}

}
