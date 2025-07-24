package assignment;

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num1= sc.nextInt();

        if (num1%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
