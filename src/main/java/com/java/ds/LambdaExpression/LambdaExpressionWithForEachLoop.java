package com.java.ds.LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaExpressionWithForEachLoop {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Sunil");
        list.add("Harish Kumar Gupta");
list.add("Harish Kumar Gupta");
list.add("Harish Kumar Gupta");
list.add("Harish Kumar Gupta");
System.out.println("The List of the Object is ");
Iterator itr = list.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
System.out.println("I am using Lambda Expression");
// WithOut Itertor i am using lambda Expression

list.forEach(
    (name) -> System.out.println(name)
);

    }
}
