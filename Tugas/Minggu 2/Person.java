package com.adilah.week2;

class Prson {
    String fName;
    String lName;
    String stuId;
    boolean stuStatus;

    public void set(String fName, String lName, String stuId, boolean stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }
    public void show() {
        System.out.println("Student Indetify");
        System.out.println("Student Name\t: "+fName+lName);
        System.out.println("Student ID\t\t: "+stuId);
        System.out.println("Student Status\t: "+(stuStatus ? "Active" : "Inactive"));
    }
}
public class Person {
    public static void main(String[] args) {
        Prson student = new Prson();
        student.set("Lisa", "Palombo", "123456789", true);
        student.show();
    }
}