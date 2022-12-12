package com.java.ds.Matrix;

import java.net.InetAddress;
import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        System.out.println("The Identity Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of the Rows");
        int row = sc.nextInt();
        System.out.println("Enter the Number of the column");
        int col = sc.nextInt();
        int[][] identityMatrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                identityMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Given Matrix is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(identityMatrix[i][j]+" ");
            }
            System.out.println();
        }
        int[][] identityMatrix1 = new int[row][col];
        int[][] ExceptIdentityElement = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    identityMatrix1[i][j] = identityMatrix[i][j];
                }
                else{
                    ExceptIdentityElement[i][j] = identityMatrix[i][j];
                }
            }
        }
        System.out.println("The Identity Matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(identityMatrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("The Except indentity Matrix is ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ExceptIdentityElement[i][j]);
            }
            System.out.println();
        }

    }
}
