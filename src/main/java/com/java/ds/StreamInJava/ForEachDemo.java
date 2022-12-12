package com.java.ds.StreamInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        System.out.println("This is the example of the for Each loop in java");

        List<String> list = new ArrayList<>();
        list.add("Murrit");
        list.add("john");
        list.add("piter");
        list.add("marek");
        list.add("mac");
        System.out.println("the list of the String is ");
        System.out.println(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Using for loop
        System.out.println("The USe of the for Each loop");
        for(String s : list){
            if(s.startsWith("m")){
                System.out.println(s);
            }
        }

        System.out.println("The use of the filter()");
        list.stream().filter(t->t.startsWith("m")).forEach(t->System.out.println(t));


        // The use of hashmap()
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        System.out.println("the hash map is ");
        System.out.println(map);

        // The another way to do that
        System.out.println("the use of the entrySet()");
        map.forEach((key,value)->System.out.println(key+ " :"+ value));
        map.entrySet().stream().filter(
            k->k.getKey()%2==0
        ).forEach(obj -> System.out.println(obj));

        System.out.println("The use of the consumer ");
        Consumer<String> consumer = (t)->System.out.println(t);
        System.out.println("the consumer is ");
        System.out.println(consumer);
        for(String s1 : list){
            consumer.accept(s1);
        }
    }
}
