package com.java.ds.StreamInJava.Stream25.EmployProjectusingStreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalStreamAPIMethods {
    SaveAllEmployData save = new SaveAllEmployData();

    // 1 getting the Minimum Salary from the above List of the Data is 
    public static void getMinimumSalary(){
    System.out.println("The Minimum Salary Of The Employ  is ");
    List<EmployPOJO> ListOfEmploy = SaveAllEmployData.saveAllEmployDataFile();
    // System.out.println("The List of The Employ Data is ");
    // System.out.println(ListOfEmploy);
        System.out.println(
            ListOfEmploy.stream()
            .min(Comparator.comparing(EmployPOJO::getSalary))
            
        );
    }

    public static void countDuplicateElement(){
        List<EmployPOJO> ListOfEmploy = SaveAllEmployData.saveAllEmployDataFile();
        System.out.println("The List of The Duplicate EMploye is ");
        System.out.println(
            ListOfEmploy.stream()
            .filter(name -> name.getFirstName().startsWith("Sunil"))
            .count()
        );
    }
    
}
