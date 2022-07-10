package com.javaBasicsPractise.controlFlowStatements;

public class ForLoop{
    public static void main(String[] args) {
        int sum = 0;
        for (int number=0; number<=5; number+=2){
            sum = sum + number;
        }
        System.out.println(sum);
    }
}

/*
Iteration1 = 0;
    sum = 0;
Iteration2 = 2
    sum = 0 + 2 = 2;
Iteration3 = 4
    sum = 4 + 2 = 6;
Iteration4 = 6;
    Condition failed. end of program..
 */
