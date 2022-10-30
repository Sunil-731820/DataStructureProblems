package com.java.ds.EmployProjectUsingStream.DepartmentProjectImplementation;

import java.util.List;

public interface DepartmentDAOInterface {
    Department getDepartmentByName(String departmentName);
    Department getDepartmentById(Integer departmentId);
    List<Department> getAllDepartment();


}
