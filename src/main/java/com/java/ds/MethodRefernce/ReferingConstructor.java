package com.java.ds.MethodRefernce;
class Message{
    Message(String msg){
        System.out.println("This is the Message Given By "+ msg);
    }
}

interface Messgaable{
    Message getMessage(String msg);
}
public class ReferingConstructor {
    public static void main(String[] args) {
        Messgaable msg1 = Message::new;
        msg1.getMessage("Sunil");
    }
}
