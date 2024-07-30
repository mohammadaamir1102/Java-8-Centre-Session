package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm7 {
    public static void main(String[] args) {
        Function<Integer,Integer> i=Function.identity();
        System.out.println(i.apply(10));
    }
}
