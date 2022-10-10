package com.java.ds.Matrix;

import java.util.Scanner;

public class TranposeOfMatrix {
    public static void main(String[] args) {
        System.out.println("The Tranpose of the Matrix is");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of the Rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of the Column");
        int column = sc.nextInt();
        int[][] Matrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Given Matrix is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("after tranpose of the Matrix is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(Matrix[j][i]);
            }
            System.out.println();
        }


    }
}
