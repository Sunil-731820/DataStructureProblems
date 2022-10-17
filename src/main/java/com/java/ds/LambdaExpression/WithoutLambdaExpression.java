package com.java.ds.LambdaExpression;

interface Drawer{
    public void draw();
}

public class WithoutLambdaExpression {
    public static void main(String[] args) {
        Drawer d = new Drawer() {

            @Override
            public void draw() {
               System.out.println("I am making the drawer function");
            }
            
        };
        d.draw();
    }
}
