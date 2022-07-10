package com.javaBasicsPractise;

public class PostPreFix {
    //x++
//    public static int postfix(int x) {
//        int y = x;
//        x += 1;
//        return x;
//    }

    public static void main(String[] args){
        //POSTFIX - Updates second iteration
        System.out.println("Postfix Increment concept below");
        int x = 10;
        System.out.println(x++);   //10
        System.out.println(x++);   //11

        //PREFIX - Default behaviour - Value updates right first iteration
        int y = 25;
        System.out.println("Prefix Increment concept below");
        System.out.println(++y);
        System.out.println(++y);

        //Postfix Decrement - Updates for the second iteration
        System.out.println("Postfix Decrement concept below");
        int p = 55;
        System.out.println(p);
        System.out.println(p--);
        System.out.println(p);

        //Prefix Decrement - Updates direct
        int q = 76;
        System.out.println("Prefix Decrement concept below");
        System.out.println(q);
        System.out.println(--q);
        System.out.println(q);
    }
}