package com.java.ds.Matrix;

import java.util.Scanner;

public class subtractionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1, col1,row2,col2;
        System.out.println("Enter the Number of the row for the first Matrix");
        row1 = sc.nextInt();
        System.out.println("Enter the Number of the column for the first Matrix");
        col1 = sc.nextInt();
        System.out.println("Enter the number of the row for the second matrix ");
        row2 = sc.nextInt();
        System.out.println("Enter the Number of the column for the second Matrix");
        col2 = sc.nextInt();
        if(row1==row2 && col1==col2){
            int[][] firstMatrix = new int[row1][col1];
            int[][] secondMatrix = new int[row2][col2];
            int[][] subtractMatrix = new int[row1][col1];
            System.out.println("Enter the element of the first matrix");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    firstMatrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("the First matrix is ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(firstMatrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter the element of the second Matrix ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    secondMatrix[i][j] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println("The Second Matrix is");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(secondMatrix[i][j]+" ");
                }
                System.out.println();
            }
            // Subtraction of the Matrix is 
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    subtractMatrix[i][j] = firstMatrix[i][j]-secondMatrix[i][j];
                }
                System.out.println();
            }
            System.out.println("after the subtraction of the two matrix is ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(subtractMatrix[i][j]+" ");
                }
                System.out.println();
            }

        }else{
            System.out.println("For Subtraction rows and column must be Equal ");
        }
    }
}
