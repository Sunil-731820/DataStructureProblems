package com.java.ds.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{

    private int idOfProduct ;
    private String nameOfProduct;
    float priceOfProduct;

    public Product(int idOfProduct, String nameOfProduct, float priceOfProduct) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }


}

public class AnotherProductExample {
    public static void main(String[] args) {
        System.out.println("The Filter Data On the Basis of price ");
        List<Product> listOfProduct = new ArrayList<>();
        listOfProduct.add(new Product(1, "Samsung A5", 170000f));
        listOfProduct.add(new Product(2, "Iphone 6S", 650000f));
        listOfProduct.add(new Product(3, "Sony Xperia", 25000f));
        listOfProduct.add(new Product(4, "NOKIA", 15000f));
        
        // Filtering the Data on the Basis of Price using Lambda Expression
        Stream <Product> filteredData = listOfProduct.stream().filter(p -> p.priceOfProduct>20000);
        filteredData.forEach(
            product -> System.out.println(product.priceOfProduct)
        );
    }
}
