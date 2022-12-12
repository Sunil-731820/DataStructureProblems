package com.java.ds.DesignPatternInJava.StructuralDesignPattern.ProxyPattern.ProductionProxy;

public class ProxyInternetAccess implements OfficeInternetAccess1{
     protected String empoyeeName;
    RealInternetAccess realIntAccess;

    private String employeeName;
    private RealInternetAccess realaccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }



    @Override
    public void grantInternetAccess() {
        // System.out.println("You are not able to access the Internet Here ");
      
        if (getRole(employeeName) > 4) {
            realaccess = new RealInternetAccess(employeeName);
            realaccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }
    
    public int getRole(String emplName) {
        // Check role from the database based on Name and designation
        // return job level or job designation.
        return 9;
    }
    
}
