package com.OnlyProblems;

import java.util.Scanner;

public class TargetRange {

    public static void targetRangeChecking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Range");
        int lowerRange = sc.nextInt();
        System.out.println("Enter The higher Range");
        int higherRange = sc.nextInt();
        System.out.println("Enter the Value For Checking");
        int value = sc.nextInt();
        if(value> lowerRange && value<higherRange){
            System.out.println("The number Lies In  the Range");
        }else{
            System.out.println("Number Does Not Lies in The Range");
        }
    }
    public static void main(String[] args) {
        System.out.println("finding the target Number in Range Or Not");
        targetRangeChecking();
    }
}
