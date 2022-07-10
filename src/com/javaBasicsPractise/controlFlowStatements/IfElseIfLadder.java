package com.javaBasicsPractise.controlFlowStatements;

public class IfElseIfLadder {
    public static void main(String[] args) {
        String tech = "devops";
        if (tech.toLowerCase() == "java"){
            System.out.println("Java Developer");
        }
        else if(tech.toLowerCase() == "python"){
            System.out.println("Python Developer");
        }
        else if(tech.toLowerCase() == "devops"){
            System.out.println("Data Engineer");
        }
        else {
            System.out.println("Please try again");
        }
    }
}
