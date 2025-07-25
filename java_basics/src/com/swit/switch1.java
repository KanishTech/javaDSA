package com.swit;

import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;

            case "Apple":
                System.out.println("A sweet red fruit");
                break;

            case "Orange":
                System.out.println("Round fruit");
                break;

            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("enter a valid fruit");
        }
    }
}
