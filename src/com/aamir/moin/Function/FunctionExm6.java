package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm6 {
    public static void main(String[] args) {
        Function<Integer,Double> half=a->a/2.0;
        half=half.compose(a->a*8);
        System.out.println(half.apply(10));
    }
}
