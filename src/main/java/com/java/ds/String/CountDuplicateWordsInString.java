package com.java.ds.String;

import java.util.Scanner;

public class CountDuplicateWordsInString {
	public static void Wordcount() {
		System.out.println("Enter the Word that duplicate words  to be counted here");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("the String is ");
		System.out.println(sentence);
		int count;
		sentence = sentence.toLowerCase();
		String words[] = sentence.split(" ");
		System.out.println("the Dupliicate Words in the String is");
		System.out.println(sentence);
		for(int i=0;i<words.length;i++) {
			count = 1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if(count>1 &&words[i]!="0") {
				System.out.println(words[i]);
			}
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		Wordcount();
		
	}

}
