package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExm1 {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> function=(s1, s2)->
            s1.length()+s2.length();

        System.out.println(function.apply("abdul","faiz"));
    }
}
