package com.javaBasicsPractise.controlFlowStatements;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] names = {"Arun", "LHS", "KITS"};
        int [] contacts = {9876283, 7736992, 6297327, 528399, 552673};

        for (String data : names){
            System.out.println(data);
        }
        for (int id : contacts){
            System.out.println(id);
        }
    }
}
