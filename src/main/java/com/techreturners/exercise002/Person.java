package com.techreturners.exercise002;

public class Person {
    public String firstName;  // properties
    public String lastName;
    public String city;
    public int age;

    public void printData() {
        System.out.println(firstName);    // methods
        System.out.println(lastName);
        System.out.println(city);
        System.out.println(age);
    }

    //constructor
    public Person(String firstName, String lastName, String city, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.age = age;
    }

}
