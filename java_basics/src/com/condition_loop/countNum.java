package com.condition_loop;

public class countNum {
    public static void main(String[] args) {
        int n = 744773;

        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem == 7){
                count++;
            }
            n/=10;
        }

        System.out.println(count);
    }
}
