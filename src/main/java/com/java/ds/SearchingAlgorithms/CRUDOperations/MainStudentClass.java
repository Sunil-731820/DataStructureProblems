package com.java.ds.SearchingAlgorithms.CRUDOperations;

import java.util.Scanner;

public class MainStudentClass {
    public static void main(String[] args) {
        System.out.println("Enter the Choice for performing the Operations");
        Scanner sc = new Scanner(System.in);
        int Choice = sc.nextInt();
        CreateReadUpdateDelete add1 = new CreateReadUpdateDelete();
       
        switch (Choice) {
            case 1:
            add1.addStudent();
                break;
            case 2:
             add1.displayStudentDetails();
                break;    
        
            default:
                break;
        }

    }
}
