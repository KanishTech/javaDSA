package com.func;

import java.sql.SQLOutput;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,4,5,6,7);

    }

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
