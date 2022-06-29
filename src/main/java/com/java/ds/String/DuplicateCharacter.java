package com.java.ds.String;

import java.util.Scanner;

class DuplicateChar{
	public void character() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] carray = str.toCharArray();
//		System.out.println(carray.length);
		for(int i=0;i<str.length();i++) {
//			int count =0;
			for(int j=i+1;j<str.length();j++) {
				if(carray[i]==carray[j]) {
					System.out.print(carray[j]+" ");
					break;
				}
			}
		}
	}
}
public class DuplicateCharacter {
	public static void main(String[] args) {
		DuplicateChar dupl = new DuplicateChar();
		dupl.character();
		
	}

}
