package com.java.ds.LambdaExpression;

interface Sayable{
    public String say(String name);
}

public class LambdaExpressionWithSinglePara {
    public static void main(String[] args) {
        Sayable s1 = (name) ->{
            return "Hello "+ name;
        };
        System.out.println("Welcome to Single Parameter");
        System.out.println(s1.say("Sunil"));
    }
}
