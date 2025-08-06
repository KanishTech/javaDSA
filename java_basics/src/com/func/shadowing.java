package com.func;

public class shadowing {
    static int a = 90;//this will be shadowed at line 8

    public static void main(String[] args) {
        System.out.println(a); //90
        int a = 40;
        System.out.println(a);// 40
        fun();

    }
    static void fun(){
        System.out.println(a);
    }
}
