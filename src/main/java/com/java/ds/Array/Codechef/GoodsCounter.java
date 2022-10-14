package com.java.ds.Codechef;

import java.util.Scanner;

public class GoodsCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int N = sc.nextInt();
		    int A[] = new int[N];
		    int B[] = new int[N];
		    int counterGood =0;
		    for(int i=0;i<N;i++){
		        A[i] = sc.nextInt();
		    }
		    for(int j=0;j<N;j++){
		        B[j] = sc.nextInt();
		    }
		    for(int i =0;i<N;i++){
		        for(int j=0;j<N;j++){
		            if(i<j){
		                if((A[i]==B[j]) && (A[j] == B[i]) ){
		                    counterGood = counterGood+1;
		                }
		            }
		        }
		    }
		    System.out.println(counterGood);
		    
		}
    }
}
