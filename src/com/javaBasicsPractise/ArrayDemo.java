package com.javaBasicsPractise;

public class ArrayDemo {
    public static void main(String[] args) {
        //declares am array of integers
        int[] anArray = new int[4];
        String[] firstName = new String[5];
        firstName[0] = "Rajini";
        firstName[2] = "Arun";
        String[] lastName = {"Ragula", "Muniganti", "Polusani", "Gurrala"};
        System.out.println("Hello! I am "+ firstName[0]+ " " +lastName[0] +".");
    }
}
