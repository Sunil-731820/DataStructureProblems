package com.java.ds.StreamInJava.Stream25.EmployProjectusingStreamAPI;

public class MainCityCallHere {
    public static void main(String[] args) {
        System.out.println("I am City here");
        CityFunctionalPartsStreamAPI city = new CityFunctionalPartsStreamAPI();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("I Am Calling the List Of CityName Here ");
        city.ListOfCityName();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("i Am Calling the List Of Temp Which is Greater than 10 ");
        city.getListOfTempWhichIsGreaterThan10();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("I Am Calling the Set of Temp Which is Greater than 10 ");
        city.getSetOfTempWhichIsGreaterThan10();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("I Am calling the List of Temp Which is Greater than 10 and Conacatening with Comma");
        city.getAllTempDataWhichIsGreaterThan10AndJoinWithComma();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("The Number Of The City and the Number Of the Element is ");
        CityFunctionalPartsStreamAPI.CountNumberOfCityOfListElementIs();

    }
}
