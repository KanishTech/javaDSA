package assignment.condLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.next();
        String r = "";
        char ch;

        for(int i =0; i<str.length(); i++){
            ch = str.charAt(i);

            r = ch + r;
        }

        System.out.println("Reversed string: "+r);
    }
}
