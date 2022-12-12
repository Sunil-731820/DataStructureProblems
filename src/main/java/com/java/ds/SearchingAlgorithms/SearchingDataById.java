package com.java.ds.SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{

    private int studentId;
    private String firstName;
    private String lastName;
    private String address;
    private int pinCode;

    public Student(int studentId, String firstName, String lastName, String address, int pinCode) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pinCode = pinCode;
    }

    
    public int getStudentId() {
        return studentId;
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
                + address + ", pinCode=" + pinCode + "]";
    }
    

    
}


public class SearchingDataById {
    public static void main(String[] args) {

        List<Student> listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student(1, "Sunil","Kumar", "Lucknow", 226020));
        listOfStudent.add(new Student(2, "Harish", "Kumar", "USA", 560037));
        listOfStudent.add(new Student(3, "Abhisek", "Sarangi", "Odisha",222027));

        Iterator itr = listOfStudent.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
       
        int id1 = 2;
        List<Student> filterStudent = listOfStudent.stream().filter(
                student -> student.getStudentId() == id1).collect(Collectors.toList());
        System.out.println("the List of the Student is ");
        System.out.println(filterStudent);
        
    }
}
