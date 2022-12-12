package com.java.ds.DesignPatternInJava.StructuralDesignPattern.ProxyPattern.VirtualProxyInJava;

public class Company {
    private String companyName;
    private String companyAddress;
    private String companyContactNo;
    private ContactList contactList;


    
    @Override
    public String toString() {
        return "Company [companyName=" + companyName + ", companyAddress=" + companyAddress + ", companyContactNo="
                + companyContactNo + ", contactList=" + contactList + "]";
    }
    public Company(String companyName, String companyAddress, String companyContactNo, ContactList contactList) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public String getCompanyContactNo() {
        return companyContactNo;
    }
    public void setCompanyContactNo(String companyContactNo) {
        this.companyContactNo = companyContactNo;
    }
    public ContactList getContactList() {
        return contactList;
    }
    public void setContactList(ContactList contactList) {
        this.contactList = contactList;
    }



    
    
}
