package com.java.ds.EmployProjectUsingStream.EmployProjectImplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Employ {
    private int empId;
    private String empName;
    private double empSalary;
    private int empAge;
    private String empDeptId;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public double getEmpSalary() {
        return empSalary;
    }
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
    public int getEmpAge() {
        return empAge;
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public String getEmpDeptId() {
        return empDeptId;
    }
    public void setEmpDeptId(String empDeptId) {
        this.empDeptId = empDeptId;
    }
    public Employ(int empId, String empName, double empSalary, int empAge, String empDeptId) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empAge = empAge;
        this.empDeptId = empDeptId;
    }
    @Override
    public String toString() {
        return "Employ [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
                + ", empDeptId=" + empDeptId + "]";
    }

    
public static List<Employ> getAllEmployDataSave(){
    List<Employ> ListOfData = new ArrayList<>();
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(2,"Harish", 21000, 34, "CSE"));
    ListOfData.add(new Employ(12,"Raghu", 90000, 23, "CE"));
    ListOfData.add(new Employ(90, "Abhisek", 100000, 30, "ME"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(2, "Harish", 21000, 34, "CSE"));
    ListOfData.add(new Employ(12, "Raghu", 90000, 23, "CE"));
    ListOfData.add(new Employ(90, "Abhisek", 100000, 30, "ME"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));
    ListOfData.add(new Employ(1, "Sunil", 12000, 20, "C001"));

    return ListOfData;
}

public static void main(String[] args) {
    System.out.println("The Filtered Data Start With Chaaracter is ");
    List<Employ> ListOfEmployee = new ArrayList<>();
    ListOfEmployee.addAll(new EmployDAOIMPL().getEmployeeStartWith("A"));
    System.out.println(ListOfEmployee);
    Iterator itr = ListOfEmployee.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    // 2 GetSumOf All Employ

    System.out.println("The Sum Of All Employ is ");
    EmployDAOIMPL dao = new EmployDAOIMPL();
    int sumOfAllEmploy = dao.getSumOfAllEmployees();
    System.out.println("The Number Of Employ is "+ sumOfAllEmploy);

    // 3 : GetAllEmploy In the form of List is 
    System.out.println("The List Of the Employ data is ");
    List<Employ> getListOfEmploy = dao.getAllEmployees();
    System.out.println(getListOfEmploy);

    // 4 : get Map Of getMapOfDepartmentIdAndEmployeesList
    

}
    
    
}
