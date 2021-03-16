package com.adilah.tugas2;

class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ManagingPeople{
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if (p1.getAge() == p1.getAge()) {
            System.out.println(p1.getName()+" is the same age as "+p2.getName());
        }
        else {
            System.out.println(p1.getName()+" is NOT the same age as "+p2.getName());
        }
    }
}
