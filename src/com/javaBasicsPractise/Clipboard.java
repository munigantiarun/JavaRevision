package com.javaBasicsPractise;

public class Clipboard {
    public static void main(String[] args) {
        int num = 7;
        int sum = 0;
        while (num<10 && num>5){
            num--;
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
