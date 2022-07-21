package com.javaBasicsPractise;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int [] myNumbers = {1,2,3};
            System.out.println(myNumbers[1]);
        } catch (Exception exception){
            System.out.println("something went wrong.!");
        }
        finally {
            System.out.println("Code execution done!!");
        }
    }
}
