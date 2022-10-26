package com.java.ds.StreamInJava.Stream25;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class City{

    private String name;
    private double temp;
    
    public City(String name, double temp) {
        this.name = name;
        this.temp = temp;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTemp() {
        return temp;
    }
    public void setTemp(double temp) {
        this.temp = temp;
    }
    @Override
    public String toString() {
        return "City [name=" + name + ", temp=" + temp + "]";
    }

    
}

public class useOfCollectors {

    public static void getListOfCityName(){
        List<String> namesOfCity = prepareTemperatur().stream()
                .map(
                        City::getName)
                .collect(Collectors.toList());
                System.out.println(namesOfCity);
    }

    private static List<City> prepareTemperatur(){
        List<City> listOfCity = new ArrayList<>();
        listOfCity.add(new City("New Delhi", 33.5));
        listOfCity.add(new City("Mexico", 14));
        listOfCity.add(new City("New York", 13));
        listOfCity.add(new City("Dubai", 43));
        listOfCity.add(new City("London", 15));
        listOfCity.add(new City("Alaska", 1));
        listOfCity.add(new City("Kolkata", 10));
        listOfCity.add(new City("Sydney", 11));
        listOfCity.add(new City("Mexico", 21));
        listOfCity.add(new City("Dubai", 43));
        listOfCity.add(new City("New Delhi", 33.5));
        listOfCity.add(new City("Mexico", 14));
        listOfCity.add(new City("New York", 13));
        listOfCity.add(new City("Dubai", 43));
        listOfCity.add(new City("London", 15));
        listOfCity.add(new City("Alaska", 1));
        listOfCity.add(new City("Kolkata", 10));
        listOfCity.add(new City("Sydney", 11));
        listOfCity.add(new City("Mexico", 21));
        listOfCity.add(new City("Dubai", 43));
        listOfCity.add(new City("New Delhi", 33.5));
        listOfCity.add(new City("Mexico", 14));
        listOfCity.add(new City("New York", 13));
        listOfCity.add(new City("Dubai", 43));
        listOfCity.add(new City("London", 15));
        listOfCity.add(new City("Alaska", 1));
        listOfCity.add(new City("Kolkata", 10));
        listOfCity.add(new City("Sydney", 11));
        listOfCity.add(new City("Mexico", 21));
        listOfCity.add(new City("Dubai", 43));
        
        return listOfCity;
    }
    public static void main(String[] args) {
        System.out.println("This is the example of the Collectors in java");
        System.out.println(
            prepareTemperatur().stream()
            .filter(f ->f.getTemp()>10)
            .map(name -> name.getName())
            .collect(Collectors.toList())
        );

        System.out.println("The Set of The data is ");
        System.out.println("after the use of the toSet() in stream api in java");
        System.out.println(
            prepareTemperatur().stream()
            .filter(f ->f.getTemp()>10)
            .map(name -> name.getName())
            .collect(Collectors.toSet())
        );

        // The useOfMap()
        System.out.println("The use of Map() in java ");
        System.out.println(
            prepareTemperatur().stream()
            .filter(f ->f.getTemp()>10)
            .collect(Collectors.toMap(
            City :: getName, 
            City :: getTemp,
            (key, identicalKey) -> key)
            )
        );

        // Another example of Collection 
        // Basically perform another example after collecting the data from the list 
        System.out.println("The Another way to count the Number of city from the list of the data is ");
        System.out.println(
            prepareTemperatur().stream()
            .collect(Collectors.groupingBy(
                City ::getName,
                Collectors.collectingAndThen(
                    Collectors.counting(),
                    f ->f.intValue())
            ))
        );

        // The Another Example of the collections
        System.out.println("Counting the Number of the City in the lits of the data is ");
        System.out.println(
            prepareTemperatur().stream()
            .collect(Collectors.groupingBy(
                City :: getName,
                Collectors.counting()
            ))
        );

        // Another way to do so

        System.out.println("The Another way to get the list of the map values after using groupBy()");
        
        Map<String, List<City>> MapofList =  prepareTemperatur().stream()
            .collect(Collectors.groupingBy(
                City :: getName
            ));
        System.out.println(MapofList);
    // Collector joining(CharSequence delimiter): Concatenates the input elements,
    // separated by the specified delimiter, and returns a Collector
    System.out.println("after getting the filter data with map and join with comma");
    System.out.println(
        prepareTemperatur().stream()
        .filter(f ->f.getTemp()>10)
        .map(
            name -> name.getName()
        ).collect(Collectors.joining(","))
    );

    List<String> namesOfCity = prepareTemperatur().stream()
    .map(
        City::getName
    ).collect(Collectors.toList());
    System.out.println("The List of the City Name is ");
    System.out.println(namesOfCity);
    System.out.println("getting the list of the temp is ");
    List<Double> tempOflist = prepareTemperatur().stream()
    .map(City::getTemp).collect(Collectors.toList());
    System.out.println(tempOflist);
    System.out.println();
    System.out.println("I am calling the getAllCityByName() 5 times");
    for (int i = 0; i < 5; i++) {
        getListOfCityName();
    }

   

    // Collector <T, ?, Map<K, List>> groupingBy(Function classifier): 
    // Performs group by operation on input elements of type T. The grouping of elements is done 
    // as per the passed classifier function and returns the Collector with result in a Map.
    System.out.println("Getting the map  values of all city ");
    System.out.println(
        prepareTemperatur().stream()
        .collect(Collectors.groupingBy(
            City::getName
        ))
    );

    // The Another use of the mapping inside the Collectors

    /*
     * 
     * 13. Collector mapping(Function mapper, Collector downstream): Transforms a
     * Collector of the input elements of type U to one the input elements of type T
     * by applying a mapping function to every input element before the
     * transformation.
     */
    System.out.println("The use of the Collectors.mapping in Stream API and getting the list of values");
     System.out.println(
        prepareTemperatur().stream()
        .collect(Collectors.groupingBy(
            City::getName,
            Collectors.mapping(
                City::getTemp,
                Collectors.toList())
        ))
     );
     System.out.println("The use of the Collectors.mapping in Stream API and getting the Set of values");
    System.out.println(
        prepareTemperatur().stream()
        .collect(Collectors.groupingBy(
            City::getName,
            Collectors.mapping(
                City::getTemp,
                Collectors.toSet())
        ))
    );

    /*
     * 
     * 14. Collector<T, ?, Map<Boolean, List>> partitioningBy(Predicate predicate):
     * Partitions the input elements as per the passed Predicate, and transforms
     * them into a Map and returns the Collector
     */
    System.out.println("This is the example of the partitionBy()");
    System.out.println("getting the temp which is greater than 15  using partitioBy()");
    System.out.println(
        prepareTemperatur().stream()
        .collect(Collectors.partitioningBy(
            City -> City.getTemp()>15
            
        ))
    );

    System.out.println("Counting the number of the ELement in the Stream ");
    long countingTheData = prepareTemperatur().stream()
    .count();
    System.out.println("the Number of the ELement in the array list is ");
    System.out.println(countingTheData);
 }


   
}
