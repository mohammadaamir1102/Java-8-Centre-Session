package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm3 {
    public static void main(String[] args) {
        Function<Integer,Integer> square=a->a*a;
        System.out.println(square.apply(10));
    }
}
