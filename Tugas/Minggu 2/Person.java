package com.adilah.week2;

class Person {
    private final String fName;
    private final String lName;
    private final String stuId;
    private boolean stuStatus;

    public Person(String fName, String lName, String stuId, boolean stuStatus) {
        this.fName = fName;
        this.lName = lName;
        this.stuId = stuId;
        this.stuStatus = stuStatus;
    }

    public void identifyStudent() {
        System.out.printf("Name\t\t\t: %s %s\n", fName, lName);
        System.out.println("Student ID\t\t: " + stuId);
        System.out.println("Student Status\t: " + (stuStatus ? "Active" : "Inactive"));
    }
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getStuId() {
        return stuId;
    }

    public boolean getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(boolean stuStatus) {
        this.stuStatus = stuStatus;
    }

    public static void main(String[] args) {
        Person student = new Person("Lisa", "Palombo", "123", true);
        student.identifyStudent();
    }
}