package com.java.ds.DateInJava;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class SimpleDateformat {
    public SimpleDateformat(String string) {
    }

    public static void main(String[] args) {
        System.out.println("The Example of the Simple Date format");
        Date date = new Date();
        SimpleDateformat formatter = new SimpleDateformat("dd/MM/yyyy");
        // String str = ((DateFormat) formatter).format(date);

    }
}
