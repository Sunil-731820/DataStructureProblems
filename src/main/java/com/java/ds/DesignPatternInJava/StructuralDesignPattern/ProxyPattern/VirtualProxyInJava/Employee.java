package com.java.ds.DesignPatternInJava.StructuralDesignPattern.ProxyPattern.VirtualProxyInJava;

public class Employee {
    private String employeeName;
    private double employeeSalary;
    private String employeeDesignation;

    
    
    @Override
    public String toString() {
        return "Employee [employeeName=" + employeeName + ", employeeSalary=" + employeeSalary
                + ", employeeDesignation=" + employeeDesignation + "]";
    }
    public Employee(String employeeName, double employeeSalary, String employeeDesignation) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public String getEmployeeDesignation() {
        return employeeDesignation;
    }
    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }
    
    
}
