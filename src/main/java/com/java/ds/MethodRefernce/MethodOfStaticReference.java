package com.java.ds.MethodRefernce;

interface Sayable{
    void say();
}

interface helloInterface{
    void Hello();
}
public class MethodOfStaticReference {

    public static void sayHelloToEveryOne(){
        System.out.println("Hello everyOne ");
    }

    public static void saySomething(){
        System.out.println("Hello I am calling the static Method");
    }
    public static void main(String[] args) {
        System.out.println("this is the Example of the static method refering");
        Sayable sayable = MethodOfStaticReference::saySomething;
        sayable.say();

        helloInterface hello = MethodOfStaticReference::sayHelloToEveryOne;
        hello.Hello();
    }
}
