package com.java.ds.LambdaExpression;

interface Sayable{
    public String say();
}

public class LambdaExpressionWithoutParameter {
    public static void main(String[] args) {
        Sayable s = ()->{
            return "Hello I am calling return";
        };

        System.out.println("after calling");
        System.out.println(s.say());
    }
}
