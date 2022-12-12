package com.java.ds.Basic;
enum Level{
    HIGH,
    LOW,
    MEDIUM
}

public class AnotherExampleOfEnum {
    public static void main(String[] args) {
        System.out.println(Level.HIGH);
        System.out.println(Level.LOW);
        System.out.println(Level.MEDIUM);
        System.out.println("aFTER USEING fOR EACH lOOP");
        for(Level level:Level.values()){
            System.out.println(level);

        }
        
    }
}
