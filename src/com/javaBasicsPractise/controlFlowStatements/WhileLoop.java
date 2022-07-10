package com.javaBasicsPractise.controlFlowStatements;

public class WhileLoop {
    public static void main(String[] args) {
        int i=2;
        int sum = 0;
        while (i<=10){
            System.out.println("Pre: " + i);  //2  4  6
            i = i+2;                          //4  6  8
            sum = sum + i;                    //4  10 10
            System.out.println("Post: "+ i);  //4  6  8
            System.out.println(sum);          //4  10  18
        }
    }
}
