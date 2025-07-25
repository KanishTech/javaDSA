package com.condition_loop;

import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        //Q: print num for 1 to 10
        for (int num=1;num<=5;num++){
            System.out.println(num);
        }

        // print from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int num =1; num<=n; num++){
            System.out.println(num);
        }

        //while loop
        int i =1;
        while (i<=5){
            System.out.println(i);
            i++;
        }


        //while -> when the range or end point is unknown
    }
}
