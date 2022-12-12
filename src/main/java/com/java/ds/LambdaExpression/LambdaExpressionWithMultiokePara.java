package com.java.ds.LambdaExpression;

import java.util.Scanner;

interface Addable{
    int add(int number1,int number2);
}

public class LambdaExpressionWithMultiokePara {
    public static void main(String[] args) {
        Addable add1 = (number1,number2)->{
            return number1+number2;
        };
        System.out.println("the sum of the two Number is ");
        System.out.println(add1.add(12, 01));
    }
}
