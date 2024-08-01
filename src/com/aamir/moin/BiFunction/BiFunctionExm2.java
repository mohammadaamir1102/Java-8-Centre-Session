package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;


public class BiFunctionExm2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function=(a,b)->a+b;
        System.out.println(function.apply(10,40));
    }
}
