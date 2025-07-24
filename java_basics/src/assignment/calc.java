package assignment;

import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the calculation: ");
        int num1 = sc.nextInt();
        String op = sc.next();
        int num2 = sc.nextInt();
        System.out.println(op);
        System.out.println(num1);
        System.out.println(num2);
        if (op == "+"){
            System.out.println(num1+num2);
        }
        else if(op == "-"){
            System.out.println(num1-num2);
        }
        else if(op == "*"){
            System.out.println(num1*num2);
        }
        else if(op == "/"){
            System.out.println(num1/num2);
        }
    }
}
