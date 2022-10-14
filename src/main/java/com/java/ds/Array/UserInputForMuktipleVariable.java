package com.java.ds.Array;

import java.util.Scanner;

public class UserInputForMuktipleVariable {
    public static void subtraction(int input ,int[] variousVariable){
        

    }
    public static void main(String[] args) {
        
        System.out.println("Taking user input from various variable");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the Number of Variable You want");
        int input = sc.nextInt();
        int[] variousVariable = new int[input];

        for(int i=0;i<input;i++){
            System.out.println("Enter the Number for Subtraction");
            variousVariable[i] = sc.nextInt();
        }
        int subt = 0;
        for(int j=0;j<variousVariable.length;j++){
            subt = variousVariable[j]-subt;
        }
        System.out.println("the Subtract value is ");
        System.out.println(subt);
    }
}
