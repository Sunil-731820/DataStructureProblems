package com.java.ds.LambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Product{
    int id;
    String name ;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
}

public class LambdaComaparatorofProduct {
    public static void main(String[] args) {
        
        List<Product> listOfProduct = new ArrayList<>();
        listOfProduct.add(new Product(1, "HP Laptop", 120000));
        listOfProduct.add(new Product(2, "mac Book", 199290));
listOfProduct.add(new Product(3, "Dell Laptop", 199290));
listOfProduct.add(new Product(4, "Aspiron", 199290));
listOfProduct.add(new Product(5, "Andriod", 199290));
System.out.println("after sorting using lambda Expression is ");
        Collections.sort(
            listOfProduct,(p1,p2) -> {
                return p1.name.compareTo(p2.name);
            }
        );

        for(Product product : listOfProduct){
            System.out.println(product.id + " "+ product.name + " "+ product.price);
        }

        
}
}
