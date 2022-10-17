package com.java.ds.StreamInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
}

public class WithoutFilteringOfproduct {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP LAPTOP", 25000f));
        productList.add(new Product(2, "DELL LAPTOP", 30000f));
        productList.add(new Product(3, "LENOVO LAPTOP", 280000f));
        productList.add(new Product(4, "SONY LAPTOP", 90000f));
        productList.add(new Product(5, "APPLE LAPTOP", 90000f));

        List<Float> productPrice = new ArrayList<Float>();

        for(Product product : productList){
            if(product.price>30000){
                System.out.println(product.price);
                productPrice.add(product.price);
            }
        }

        // With the use of the filter
        System.out.println("After the use of the stream filter()");
        List<Float> productListofPrice = productList.stream()
        .filter(
            p->p.price>30000
        ).map(p->p.price).collect(Collectors.toList());
        System.out.println(productListofPrice);

        //Counting the Number of the product in the stream is 
        long productA = productList.stream()
                .count();
        System.out.println("The Number of the Stream is ");
        System.out.println(productA);

        // Finding the maximum price from the above Price
        System.out.println("to find the maximum price");

        Product maximumProductPrice = productList.stream()
        .max(
            (Product1, Product2)-> Product1.price>Product2.price ?1:-1
        ).get();
        System.out.println("the Maximum Price of the Product is ");
        System.out.println(maximumProductPrice.price);

        // Finding the minimum value of the Price is 

        Product minPriceOfProduct = productList.stream()
        .min(
            (Product1 ,Product2) -> Product1.price>Product2.price ?1:-1
        ).get();
        System.out.println("The Minimum Price from the above Product is ");
        System.out.println(minPriceOfProduct.price);

        // Count The Number of The Product less than 30,000

        long totalNumberOfProductLessthan30k = productList.stream()
        .filter(product -> product.price>30000).count();
        System.out.println("The Total number of the product whose Price is less than 30k");
        System.out.println(totalNumberOfProductLessthan30k);

        // Converting List to Set 
        Set<Float> setPriceOfProduct = 
        productList.stream()
        .filter(
            product -> product.price>30000
        ).map(
            product ->product.price
        ).collect(Collectors.toSet());
        System.out.println("the set of the Price is ");
        System.out.println(setPriceOfProduct);

        // Converting list to map 

        Map<Integer, String> productPriceMap = productList.stream()
        .collect(
            Collectors.toMap(p->p.id, p->p.name)
        );
        System.out.println("The map of the product is ");
        System.out.println(productPriceMap);

       
    }
}
