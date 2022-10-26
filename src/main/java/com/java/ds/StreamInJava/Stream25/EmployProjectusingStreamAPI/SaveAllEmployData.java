package com.java.ds.StreamInJava.Stream25.EmployProjectusingStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class SaveAllEmployData {

    public static List<EmployPOJO> saveAllEmployDataFile(){
        List<EmployPOJO> listOfEmployData = new ArrayList<>();
        listOfEmployData.add(new EmployPOJO(10295214, "Sunil", "Kumar", 23, new City("Lucknow", 30), 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(21029521, "Harish", "Kumar", 20, new City("Bangalore", 29), 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(31029521, "Subham", "Kumar", 12, new City("Delhi", 34), 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295210, "Suman", "Kumari", 15, new City("Goa", 23), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295215, "Khushboo", "Kumari", 13, new City("Chennai", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(71029521, "Arti", "Kumari", 10, new City("Noida", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295218, "Ashok", "Kumar", 40, new City("Gurugram", 34), 226020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new EmployPOJO(10295210, "Vinod", "Kumar", 40, new City("Bihar", 34), 226020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new EmployPOJO(21029521, "Pooja", "kumari", 16, new City("Ranchi", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(31029521, "Neha", "Kumari", 18, new City("Jharkhand", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295214, "Nishu", "Kumari", 6, new City("New  York", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295217, "Sushila", "Gupta", 38, new City("Mexico", 34), 226020, 1200000, "FEMALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295212, "RP", "Gupta", 39, new City("London", 34), 226020, 1200000, "MALE", "Married"));
        listOfEmployData.add(new EmployPOJO(10295219, "Muthun", "Gupta", 20, new City("Canada", 34), 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295210, "Rajesh", "Gupta", 25, new City("Steryn", 34), 226020, 1200000, "MALE", "Unmarried"));
        listOfEmployData.add(new EmployPOJO(10295217, "Ramesh", "Gupta", 55, new City("BrokSide", 34), 226020, 1200000, "MALE", "Unmarried"));
        return listOfEmployData;
        
    }
    
}
