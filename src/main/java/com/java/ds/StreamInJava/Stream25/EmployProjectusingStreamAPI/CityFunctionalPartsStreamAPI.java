package com.java.ds.StreamInJava.Stream25.EmployProjectusingStreamAPI;

import java.security.Key;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CityFunctionalPartsStreamAPI {

    // 1) Find the List of the City CLass 
    /* 
     * Here i am getting the Data after mapping with the Appropriate Attribute Using getName() and 
     * displaying the List of The Data Using Collectors.toList() in Stream
    */
    public static void ListOfCityName(){
        List<String> listOfCity = SaveAllCityData.SaveCityDataHere()
        .stream()
        .map(City :: getName)
        .collect(Collectors.toList());
        System.out.println("The List Of The City is ");
        System.out.println(listOfCity);
    }

    // 2) Finding the List of Temp Which is Greater than 10
    /*
     * I Have to filter the Data on the basis of the Temp Which is Greater than 10 
     * and displaying the Data on the in list formed after using Collectors.toList() in Stream Api
     * 
     */
    public static void getListOfTempWhichIsGreaterThan10(){
       System.out.println(
        SaveAllCityData.SaveCityDataHere()
        .stream()
        .filter(
            f -> f.getTemp()>10)
        .map(
            name -> name.getName())
        .collect(Collectors.toList())
       ); 
    }

    // 3: find the Set of All temp which is Greater than 10 
    /*
     * I Have to filter the Data on the basis of the Temp Which is Greater than 10
     * and displaying the Data on the in Set formed after using Collectors.toSet()
     * in Stream Api */

     public static void getSetOfTempWhichIsGreaterThan10(){
        System.out.println(
            SaveAllCityData.SaveCityDataHere()
            .stream()
            .filter(f -> f.getTemp()>10)
            .map(name ->name.getName())
            .collect(Collectors.toSet())
        );
     }

    //  4 : Find The Map of All temp With City Name 
    /*I have to filter tha temp which is Greater than 10 and map the temp and city to map using 
    map() in stream Api
     * 
     */

     public static void getAllMapCityWithTemp(){
        System.out.println(
            SaveAllCityData.SaveCityDataHere()
            .stream()
            .filter(
                f -> f.getTemp()>10)
            .collect(Collectors.toMap(
                City :: getName,
                City :: getTemp,
                (Key, identicalKey )-> Key)
                )
        );
     }

    //  5 : Find the list of temp which is seprated by , after getting whose temp is greater than 10

    /*
     * I have to filter the temp Data which is greater than 10 and joining with comma
     * using map() in stream API 
     */

     public static void getAllTempDataWhichIsGreaterThan10AndJoinWithComma(){
        System.out.println(
            SaveAllCityData.SaveCityDataHere()
            .stream()
            .filter(f -> f.getTemp()>10)
            .map(name -> name.getName())
            .collect(Collectors.joining(","))
        );
     }

    //  5 : Counting the Number of Element in the List 
     /*
      * i have to count the Number of the Element of the City in the List using Count() 
      in Stream API
      */

      public static void CountNumberOfCityOfListElementIs(){
        System.out.println(
            SaveAllCityData.SaveCityDataHere()
            .stream()
            .count()
        );
      }
}
