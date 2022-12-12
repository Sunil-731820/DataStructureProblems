package com.java.ds.DesignPatternInJava.StructuralDesignPattern.ProxyPattern.ProductionProxy;

/*
 * Simply, proxy means an object representing another object.
 * According to GoF, a Proxy Pattern "provides the control for accessing the original object".
*So, we can perform many operations like hiding the information of original object, 
*on demand loading etc.
*Proxy pattern is also known as Surrogate or Placeholder.
*It provides the protection to the original object from the outside world.

 */
public class UseOfProxyPattern {
    public static void main(String[] args) {
        OfficeInternetAccess1 access = new ProxyInternetAccess("Sunil Kumar");
        access.grantInternetAccess();
        
    }
}
