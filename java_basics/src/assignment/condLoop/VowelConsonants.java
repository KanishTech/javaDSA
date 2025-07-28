package assignment.condLoop;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().trim().charAt(0);
        String str= "aeiouAEIOU";
        for(int k = 1; k<=5; ++k){
            System.out.println(k);
        }

        if (str.indexOf(a) == -1){
            System.out.println("consonant");
        }
        else{
            System.out.println("Vowel");
        }
    }

}
