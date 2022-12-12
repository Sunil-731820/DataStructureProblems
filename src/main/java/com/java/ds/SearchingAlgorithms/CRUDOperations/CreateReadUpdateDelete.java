package com.java.ds.SearchingAlgorithms.CRUDOperations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CreateReadUpdateDelete {
    List<StudentDetails> details = new ArrayList<StudentDetails>();
    
    public void addStudent(){
        System.out.println("I am calling addStudent()");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id Here");
        int studentId = sc.nextInt();
        System.out.println("Enter Full name");
        String studentFullName = sc.nextLine();
        System.out.println(studentFullName.length());
        System.out.println("Enter Address");
        String studentAddress = sc.next();
        System.out.println("Enter pincode ");
        int studentPincode = sc.nextInt();
        details.add(new StudentDetails(studentId, studentFullName, studentAddress, studentPincode));
        // System.out.println(details);
        displayStudentDetails();
        
    }

    public void displayStudentDetails(){
        System.out.println("I am calling the display Student details");
        Iterator itr = details.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
