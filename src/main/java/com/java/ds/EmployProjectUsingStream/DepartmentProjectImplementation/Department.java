package com.java.ds.EmployProjectUsingStream.DepartmentProjectImplementation;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private int departmentId;
    private String departmentName;
    private String departmentInfo;
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentInfo() {
        return departmentInfo;
    }
    public void setDepartmentInfo(String departmentInfo) {
        this.departmentInfo = departmentInfo;
    }
    public Department(int departmentId, String departmentName, String departmentInfo) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentInfo = departmentInfo;
    }
    @Override
    public String toString() {
        return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentInfo="
                + departmentInfo + "]";
    }

    public static List<Department> saveAllDepartmentData(){
        List<Department> listOfDepartment = new ArrayList<>();
        listOfDepartment.add(new Department(1, "CSE", "Computer"));
        listOfDepartment.add(new Department(2, "CE", "Civil"));
        listOfDepartment.add(new Department(4, "ME", "Mechnical"));

        return listOfDepartment;
    }

    public static void main(String[] args) {
        DepartmentDAOIMPL dao = new DepartmentDAOIMPL();
        List<Department> Dept  = dao.getAllDepartment();
        System.out.println("The List Of The Dept Data is ");
        System.out.println(Dept);

        //2 : List by DeptName;
        Department deptByName = dao.getDepartmentByName("CSE");
        System.out.println(deptByName);
    }

    
}
