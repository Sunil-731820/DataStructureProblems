package com.java.ds.EmployProjectUsingStream.EmployProjectImplementation;

import java.util.List;
import java.util.Map;

public interface EmployDAOInterface {
    List<Employ> getEmployeeStartWith(String startingChar);
    int getSumOfAllEmployees();
    List<Employ> getAllEmployees();
    Map<Integer,List> getMapOfDepartmentIdAndEmployeesList(String departmentName);
}
