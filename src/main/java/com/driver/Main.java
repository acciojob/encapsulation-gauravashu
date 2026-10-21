package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Task 4: Trying to access private variable directly
        // obj.name = "Ashish";
        // System.out.println(obj.name);

        // Error: name has private access in RWOnly

        // Task 6: Using setter to set the value
        obj.setName("Ashish");

        // Using getter to access the value
        System.out.println(obj.getName());
    }
}