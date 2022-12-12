package com.java.ds.StreamInJava;

abstract class AbstractClasss{

    public AbstractClasss(){
        System.out.println("you can Create the Abstract Constructor");
    }

    abstract int add(int number1, int number2); // abstract method

    int sub(int number11,int number12){ // non abstract method
        return number11-number12;
    } 

    static int multiply(int number22 , int number23){
        return number22*number23;
    }
}


public class abstractClassInJava extends AbstractClasss{
    public static void main(String[] args) {
        System.out.println("this is the Example of the abstract class ");
        abstractClassInJava abs = new abstractClassInJava();
        int res1 = abs.add(1, 10);
        int res2 = abs.sub(12, 11);

        int res3 = AbstractClasss.multiply(12, 12);
        System.out.println("the sum of the Two Number is "+ res1);
        System.out.println("The Subtraction of The Two Number is "+res2);
        System.out.println("The Multiplication of the Two Number is "+ res3);

    }

    @Override
    int add(int number1, int number2) {
       return number1+number2;
    }

    

}
