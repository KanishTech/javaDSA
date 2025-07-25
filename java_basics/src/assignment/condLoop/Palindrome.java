package assignment.condLoop;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int reverse = 0;

        int temp = Math.abs(n);
        while(temp!=0){
            reverse = (reverse*10) + (temp%10);
            temp/=10;
        }
        if (reverse == Math.abs(n)){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
