package com.javaBasicsPractise.controlFlowStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=0;i<=2;i++){
            for (int j=0; j<=10; j++){
                if(j==3){       
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
