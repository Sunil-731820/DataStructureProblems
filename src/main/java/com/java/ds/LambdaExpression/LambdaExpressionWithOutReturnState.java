package com.java.ds.LambdaExpression;

interface Addable{
    int add(int num1 , int num2);
}

public class LambdaExpressionWithOutReturnState {
    public static void main(String[] args) {
        Addable add1 = (num1,num2) -> (num1+num2);
        System.out.println("The Sum of the Two Number is ");
        System.out.println(add1.add(100, 100));
    }
    
}
