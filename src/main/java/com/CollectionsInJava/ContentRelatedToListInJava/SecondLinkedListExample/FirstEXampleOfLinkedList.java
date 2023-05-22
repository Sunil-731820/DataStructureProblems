package com.CollectionsInJava.ContentRelatedToListInJava.SecondLinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

import javax.sound.sampled.Line;

public class FirstEXampleOfLinkedList {
    public static void main(String[] args) {
        System.out.println("This is The Example Of THe Linkedlist  ");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add("vijay");
        linkedList.add("Ravi");
        linkedList.add("Ajay");
        System.out.println("The LinkedList is ");
        System.out.println(linkedList);
        System.out.println("After The Use of The Iterator ");
        Iterator itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
