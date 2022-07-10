package com.javaBasicsPractise.controlFlowStatements;

public class SumOfEvenNumbersForLoop {
    public static void main(String[] args) {
        int sum = 0;
        for(int num=0; num<10; num++){
            if (num%2==0){
                sum = sum + num;
            }
        }
        System.out.println(sum);
    }
}
