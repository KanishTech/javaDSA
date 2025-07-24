package com.basics;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10){
            System.out.println("Hello World");
        }
        System.out.println("\nWhile Loop");
        int count = 1;
        while(count != 5){
            System.out.println(count);
            count++;
        }

        //for loop
        System.out.println("\nFor loop");
        for(int count1 = 1; count1!=5;count1++){
            System.out.println(count1);
        }
    }
}
