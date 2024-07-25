package com.example.demo;

public class Student {
    private String fname;
    private String lname;
    private String rollNo;
    private String department;
    private Address address;

    public String getName() {
        return fname;
    }

    public void setName(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("Hello: "+fname+ " "+ lname+ " Roll No: "+ rollNo + " "+ "Department:"+department+" "+address);
    }
}
