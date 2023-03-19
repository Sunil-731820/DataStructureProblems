package com.java.ds.Matrix;

import java.util.Scanner;

public class Add_Matrix {
	public static void main(String[] args) {
		int p,q,m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows of the first matrix");
		p = s.nextInt();
		System.out.println("Enter the number of column of the first matrix ");
		q = s.nextInt();
		System.out.println("Enter the number of rows of the second matrix");
		m = s.nextInt();
		System.out.println("Enter the number of the column of the second matrix");
		n = s.nextInt();
		if(p==m && q==n) {
			int a[][] = new int[p][q];
			int b[][] = new int[m][n];
			int c[][] = new int[m][n];
			
			System.out.println("taking the input for the first matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					a[i][j] = s.nextInt();
				}
			}
			
			System.out.println("\ntaking the input for the second matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					b[i][j] = s.nextInt();
				}
			}
			
			System.out.println("\npriting the first matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.println(a[i][j]+" ");
				}
				System.out.println("");
			}
			
			System.out.println("\npriting the second matrix");
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.println(b[i][j]+" ");
				}
				System.out.println("");
			}
			
			System.out.println("\nfinding the sum of the two matrix");
			for(int i=0;i<p;i++) {
				for(int j=0;j<n;j++) {
					c[i][j] = a[i][j]+b[i][j];
				}
			}
			
			System.out.println("\npriting the matrix after addition ");
			for(int i=0;i<p;i++) {
				for(int j=0;j<q;j++) {
					System.out.println(c[i][j]+ " ");
				}
				System.out.println(" ");
			}
		}else {
			System.out.println("addition is not possible ");
		}
	}

}
