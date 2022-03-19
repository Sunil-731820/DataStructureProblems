package com.java.ds.String;

import java.util.Scanner;

public class CountSubStringInString {
	
	 static int countSubString(String pat, String txt) {       
	        int M = pat.length();       
	        int N = txt.length();       
	        int res = 0;
	 
	        /* A loop to slide pat[] one by one */
	        for (int i = 0; i <= N - M; i++) {
	            /* For current index i, check for
	        pattern match */
	            int j;           
	            for (j = 0; j < M; j++) {
	                if (txt.charAt(i + j) != pat.charAt(j)) {
	                    break;
	                }
	            }
	 
	            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
	            if (j == M) {               
	                res++;               
	                j = 0;               
	            }           
	        }       
	        return res;       
	    }
	 
	 
	public static void main(String[] args) {
		String txt,pat;
		System.out.println("Enter the String ");
		Scanner sc = new Scanner(System.in);
		txt = sc.nextLine();
		System.out.println("Enter the subString");
		pat = sc.nextLine();
		System.out.println(countSubString(pat, txt));
		
	}

}
