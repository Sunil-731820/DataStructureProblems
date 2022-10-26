package com.java.ds.StreamInJava.Stream25.EmployProjectusingStreamAPI;

public class EmployPOJO {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private City city;
    private int pinCode;
    private double salary;
    private String gender;
    private String maritalStatus;
    
    public EmployPOJO(int id, String firstName, String lastName, int age, City city, int pinCode, double salary,
            String gender, String maritalStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.pinCode = pinCode;
        this.salary = salary;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    @Override
    public String toString() {
        return "EmployPOJO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
                + ", city=" + city + ", pinCode=" + pinCode + ", salary=" + salary + ", gender=" + gender
                + ", maritalStatus=" + maritalStatus + "]";
    }

    
}
