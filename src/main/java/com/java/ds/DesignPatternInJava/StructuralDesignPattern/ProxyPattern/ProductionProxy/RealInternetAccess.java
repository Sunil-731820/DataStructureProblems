package com.java.ds.DesignPatternInJava.StructuralDesignPattern.ProxyPattern.ProductionProxy;

public class RealInternetAccess implements OfficeInternetAccess1{
    protected String employeeName;

    public RealInternetAccess(String empName){
        this.employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: " + employeeName);
        
    }
    
    
}
