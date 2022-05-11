package com.java.ds.Codechef;

import java.util.Scanner;

public class AverageMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
		    int sizeOfArray = sc.nextInt();
		    int arr[] = new int[sizeOfArray];
		    int Totalmean = sc.nextInt();
		    for(int i=0;i<sizeOfArray;i++){
		        arr[i] = sc.nextInt();
		    }
		    int sum = 0;
		    for(int i=0;i<sizeOfArray;i++){
		        sum = sum + arr[i];
		    }
		    int userMean = sum/sizeOfArray;
		    if(Totalmean==userMean){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
    }
}
