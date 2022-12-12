package com.java.ds.DateInJava;

import java.text.Collator;
import java.util.Date;
public class DateFirstExample {
    public static void main(String[] args) {
        System.out.println("this is the example of the Date");
        Date date1 = new Date(97,10,27); // 27 nov 1997 (start with 0)
        System.out.println("The Date1 is "+ date1);
        Date date2 = new Date(97,11,12); // 12 dec 1997
        System.out.println("The Date2 is "+date2);

        // The use of comapareTo()
        int comparison = date1.compareTo(date2);
        System.out.println(comparison);

        Collator col = Collator.getInstance();
        String str1 = "ab";
        String str2 = "AB";
        int comparisonOfString = col.compare(str1, str2);
        System.out.println(comparisonOfString);

    }
}
