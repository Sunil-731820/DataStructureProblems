package com.java.ds.Basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample1 {
    public static void main(String[] args) throws ParseException {
        String sDate1 = "2022-11-02";
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(sDate1);
        System.out.println(sDate1 + "\t" + date1);
    }
}
