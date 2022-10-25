package com.java.ds.CreationDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This is the abstract class 
abstract class Plan{

    protected double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}


// This is the concrete class that extends Plan

class DomesticPlan extends Plan{

    @Override
    void getRate() {
      rate = 3.50;
        
    }

}

class CommercialPlan extends Plan{

    @Override
    void getRate() {
       rate = 7.50;
    }
}

class InstitutionalPlan extends Plan{

    @Override
    void getRate() {
        rate = 5.50;
        
    }
    
}

// GetPlanFactory is used to generate the plan of the above extends class

class GetPlanFactory{

    public Plan getPlan(String planType){
        if(planType==null){
            return null;
        }

        if(planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan();
        }
        else if (planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan();
        }
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")){
            return new InstitutionalPlan();
        }
        return null;
    }
}


public class RealWorldExampleOfElectricityBill {
    public static void main(String[] args) throws IOException {
        System.out.println("this is the example of the getFactory");
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the Plan you want to choose ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.println("Enter the number of units for bill will be check ");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        System.out.println("Bill amount is   "+ planName+"   of"+units+"   units is ");
        p.getRate();
        p.calculateBill(units);
    }
    
}
