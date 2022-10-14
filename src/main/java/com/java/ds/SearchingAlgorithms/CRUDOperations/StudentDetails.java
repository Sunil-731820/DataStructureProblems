package com.java.ds.SearchingAlgorithms.CRUDOperations;

public class StudentDetails {
    private int studentId;
    private String studentFullName;
    private String studentAddress;
    private int studentPincode;
    
    public StudentDetails(int studentId, String studentFullName, String studentAddress, int studentPincode) {
        this.studentId = studentId;
        this.studentFullName = studentFullName;
        this.studentAddress = studentAddress;
        this.studentPincode = studentPincode;
    }
    @Override
    public String toString() {
        return "StudentDetails [studentId=" + studentId + ", studentFullName=" + studentFullName + ", studentAddress="
                + studentAddress + ", studentPincode=" + studentPincode + "]";
    }

    
}
