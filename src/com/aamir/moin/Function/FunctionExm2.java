package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm2 {
    public static void main(String[] args) {
        Function<Integer,Integer> function=(a)->a+a;
        System.out.println(function.apply(10));
    }
}
