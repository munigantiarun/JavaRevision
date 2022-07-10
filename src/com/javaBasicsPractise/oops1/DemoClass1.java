package com.javaBasicsPractise.oops1;

//class is defined
public class DemoClass1 {
    //defining fields
    int id;
    String name;

    //creating main method inside the Student class
    public static void main(String[] args) {
        //Creating an object instance
        DemoClass1 dc1 = new DemoClass1();

        //Printing values of the object
        System.out.println(dc1.id);     //accessing member through reference variable
        System.out.println(dc1.name);   //
    }
}
