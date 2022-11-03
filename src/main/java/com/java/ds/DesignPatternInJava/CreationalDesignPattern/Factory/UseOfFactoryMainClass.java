package com.java.ds.DesignPatternInJava.CreationalDesignPattern.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * The Factory Method Pattern is also known as Virtual Constructor.
 * Factory Method Pattern allows the sub-classes to choose the type of objects to create.
 * We are going to create a Plan abstract class and concrete classes that extends the Plan
 * abstract class. A factory class GetPlanFactory is defined as a next step.
 * GenerateBill class will use GetPlanFactory to get a Plan object. It will pass information (DOMESTICPLAN / COMMERCIALPLAN / INSTITUTIONALPLAN)
 *to GetPalnFactory to get the type of object it needs.
 * 
 */
public class UseOfFactoryMainClass {
    public static void main(String[] args) throws IOException {
        GetPlanFactory5 getPlanFactory5 = new GetPlanFactory5();

        System.out.println("Enter the Plan Name for the Bill Will be Generated");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();

        System.out.println("Enter the Number of Units for which The Bill will be Generated");
        int units = Integer.parseInt(br.readLine());
        
        Plan1 plan1 = getPlanFactory5.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        plan1.getRate();
        plan1.calculateBill(units);

    }
    
}
