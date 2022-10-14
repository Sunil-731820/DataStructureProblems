package com.java.ds.Array.Codechef;

import java.util.Scanner;

public class CircularTrackProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int m = sc.nextInt();
		    if(a>b){
		        System.out.println(Math.min(a-b,m-a+b));
		    }else{
		        System.out.println(Math.min(b-a,a+m-b));
		    }
		}
    }
}
