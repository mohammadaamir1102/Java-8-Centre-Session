package com.aamir.moin.Function;

import java.util.function.BiFunction;


public class FunctionExm9 {
    public static void main(String[] args) {
       BiFunction<String,String,String> function= (s1,s2)-> s1.toLowerCase()+s2.toLowerCase();
        System.out.println(function.apply("ABDUL "," MOIN"));
    }
}
