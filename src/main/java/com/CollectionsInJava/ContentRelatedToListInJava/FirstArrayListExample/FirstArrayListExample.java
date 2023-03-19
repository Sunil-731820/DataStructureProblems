package com.CollectionsInJava.ContentRelatedToListInJava.FirstArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class FirstArrayListExample {
    public static void main(String[] args) {
        System.out.println("this is The Example Of The Array  List in Java");
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("The List Of The Data is ");
        System.out.println(list);
        // Displaying Using The Iterator 
        System.out.println("After using The Iterator ");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
