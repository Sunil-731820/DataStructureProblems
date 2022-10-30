package com.java.ds.EmployProjectUsingStream.EmployProjectImplementation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployDAOIMPL implements EmployDAOInterface{

    @Override
    public List<Employ> getEmployeeStartWith(String startingChar) {
         List<Employ> ListOfEmploy = Employ.getAllEmployDataSave();
   
    List<Employ> filteredList= ListOfEmploy.stream()
    .filter(nameStartWith -> nameStartWith.getEmpName().startsWith(startingChar))
    .collect(Collectors.toList());
        
        return filteredList;
    }

    @Override
    public int getSumOfAllEmployees() {
        List<Employ> ListOfEmploy = Employ.getAllEmployDataSave();
        int sumOfAllEmploy = (int) ListOfEmploy.stream()
        .count();
        return sumOfAllEmploy;
    }

    @Override
    public List<Employ> getAllEmployees() {
      List<Employ> ListOfEmployData = Employ.getAllEmployDataSave();
      List<Employ> allEmploy = ListOfEmployData.stream()
      .collect(Collectors.toList());
        return allEmploy;
    }

    @Override
    public Map<Integer, List> getMapOfDepartmentIdAndEmployeesList(String departmentName) {
       List<Employ> employList = Employ.getAllEmployDataSave();
       
        return null;
    }

    
    
}
