package com.java.ds.Array.Codechef;

import java.util.Scanner;

public class EasyBitProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    for(int i=0;i<N;i++){
		        A[i] = sc.nextInt();
		    }
		    
		    int counter = 0;
	
		    for(int i=0;i<N;i++){
		        for(int j=1;j<N;j++){
		            if((i>=1 && i<j) && (j>i && j<=N)){
		                if(((A[i] | A[j]) + (A[i] ^ A[j]) + (A[i] & A[j]))==(N+A[j])){
		                    counter++;
		                }
		            }
		        }
		    }
		    System.out.println(counter);
		}
    }
}
