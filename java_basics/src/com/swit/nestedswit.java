package com.swit;

import java.util.Scanner;

public class nestedswit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the emp ID: ");
        int empID = sc.nextInt();
        String department = sc.next();


        switch(empID){
            case 1:
                System.out.println("Kanish R B");
                break;
            case 2:
                System.out.println("Sriraman");
                break;
            case 3:
                System.out.println("Emp Number 3");

                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter correct empID!!");
        }

        //Enhanced Switch
        switch (empID) {
            case 1 -> System.out.println("Kanish R B");
            case 2 -> System.out.println("Sriraman");
            case 3 -> {
                System.out.println("Emp Number 3");

                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Enter valid department");
                }
            }
            default -> System.out.println("Enter correct empID!!");
        }

    }
}
