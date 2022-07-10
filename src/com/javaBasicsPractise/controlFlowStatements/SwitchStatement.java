package com.javaBasicsPractise.controlFlowStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int num = 5;
        switch (num){
            case 0:
                System.out.println("Number is zero - 0");
                break;
            case 1:
                System.out.println("Number is one - 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            default:
                System.out.println(num);
        }
    }
}
