package com.java.ds.LambdaExpression;

interface Drawer{
    public void draw();
}


public class DrawerExpression {
    public static void main(String[] args) {
        int width = 10;
        Drawer d2 = () ->{
            System.out.println("Drawing with width "+width);
        };
        d2.draw();
    }
}
