package com.java.ds.Matrix;

import java.util.Scanner;

public class MultiplicationOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1,col1,row2,col2;
        System.out.println("Enter the Number of rows for the First  Matrix");
        row1 = sc.nextInt();
        System.out.println("Enter the Number of column for the First Matrix");
        col1 = sc.nextInt();
        System.out.println("Enter the Number of rows for the Second Matrix");
        row2 = sc.nextInt();
        System.out.println("Enter the Number of column for the Second Matrix");
        col2 = sc.nextInt();
        if(col1==row2 ){
            int[][] firstMatrix = new int[row1][col1];
            int[][] secondMatrix = new int[row2][col2];
            int[][] mult = new int[row1][col1];
            System.out.println("Enter the element of the first matrix ");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    firstMatrix[i][j] = sc.nextInt();
                }
                System.out.println();
            }
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    secondMatrix[i][j] = sc.nextInt();
                }
                System.out.println();
            }

            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    for(int k=0;k<row1;k++){
                        mult[i][j] +=firstMatrix[i][k]*secondMatrix[k][j];
                    }
                }
            }
            System.out.println("After the multiplication of the Two Matrix is ");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(mult[i][j]);
                }
                System.out.println();
            }


        }else{
            System.out.println("Multiplication can not perform ");
        }
        
    }
}
