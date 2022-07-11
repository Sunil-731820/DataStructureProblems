package com.java.ds.Matrix;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p,q,m,n;
		System.out.println("Enter the number of row in first Matrix");
		p = sc.nextInt();
		System.out.println("Enter the number of column of first matrix");
		q = sc.nextInt();
		System.out.println("Enter the number of row of second matrix");
		m = sc.nextInt();
		System.out.println("Enter the number of column of second matrix");
		n = sc.nextInt();
		if(p==m && q==n) {
			int A[][] = new int[p][q];
			int B[][] = new int[m][n];
			int sub[][] = new int[m][n];
			System.out.println("Taking the input of the first matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					A[i][j]= sc.nextInt();
				}
			}
			System.out.println("Taking the input of the second matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					B[i][j]= sc.nextInt();
				}
			}
			
			for(int i=0;i<p;i++) {
				for(int j=0;j<n;j++) {
					sub[i][j]= A[i][j]-B[i][j];
				}
			}
			System.out.println("the subtracted matrix is ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.print(sub[i][j] + " ");
				}
				System.out.println(" ");
			}
 		}else {
 			System.out.println("subtraction is not possible");
 		}
	}

}
