package com.java.ds.EmployProjectUsingStream.DepartmentProjectImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java.ds.EmployProjectUsingStream.EmployProjectImplementation.Employ;

public class DepartmentDAOIMPL implements DepartmentDAOInterface{

    @Override
    public Department getDepartmentByName(String departmentName) {
       List<Department> ListOfDeptByName = Department.saveAllDepartmentData();
       Department ListOfDeptByName1 = (Department) ListOfDeptByName.stream()
       .filter(name -> name.getDepartmentName().startsWith(departmentName));
        return ListOfDeptByName1;
    }

    @Override
    public Department getDepartmentById(Integer departmentId) {
        return null;
    }

    @Override
    public List<Department> getAllDepartment() {
        List<Department> getAllDepartment = Department.saveAllDepartmentData();
        List<Department> listOfDept = getAllDepartment.stream()
        .collect(Collectors.toList());
        return listOfDept;
    }
    
    
}
