package com.java.ds.DesignPatternInJava.CreationalDesignPattern.Factory;

public abstract class Plan1 {

    protected  double rate;

    abstract void getRate();

    public  void calculateBill(int units){
        System.out.println(units*rate);

    }
    
}
