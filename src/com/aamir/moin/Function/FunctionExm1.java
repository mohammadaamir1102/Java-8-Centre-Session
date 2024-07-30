package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm1 {
    public static void main(String[] args) {
        Function<String,Integer> function=(s)->s.length();
        System.out.println(function.apply("abdul"));
    }
}
