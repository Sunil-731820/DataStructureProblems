package com.java.ds.DesignPatternInJava.CreationalDesignPattern.Factory;

public class GetPlanFactory5 {
    
    public Plan1 getPlan(String planType){
        if(planType==null){
            return null;
        }
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
            return new CommercialPlan4();
        }
        else if(planType.equalsIgnoreCase("INSTITUINALPLAN")){
            return new InstitutionalPlan3();
        }
        else if (planType.equalsIgnoreCase("DOMESTICPLAN")){
            return new DomesticPlan2();
        }
        return null;
    }
}
