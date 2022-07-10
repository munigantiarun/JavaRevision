package com.javaBasicsPractise.controlFlowStatements;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Print first 10 natural numbers");
        do {
            System.out.println(i);
            i = i+2;
        }while (i<=10);
    }
}
