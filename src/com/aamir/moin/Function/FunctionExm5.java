package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm5 {
    public static void main(String[] args) {
        Function<Integer,Integer> half=a->a/2;
       half= half.andThen(a->a*5);
        System.out.println(half.apply(10));

    }
}
