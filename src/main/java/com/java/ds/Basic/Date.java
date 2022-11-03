package com.java.ds.Basic;

import java.text.SimpleDateFormat;

public class Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date is ");
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("After SimpleDateFormat");
        String strDate = formatter.format(date);
        System.out.println("Date Format with MM/dd/yyyy : " + strDate);
    }
}
