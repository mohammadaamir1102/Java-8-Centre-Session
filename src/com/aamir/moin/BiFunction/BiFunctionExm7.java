package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExm7 {
    public static void main(String[] args) {
        BiFunction<String,String,String>  biFunction=(s1,s2)->s1.concat(s2);
        System.out.println(biFunction.apply("abdul ","moin"));
    }
}
