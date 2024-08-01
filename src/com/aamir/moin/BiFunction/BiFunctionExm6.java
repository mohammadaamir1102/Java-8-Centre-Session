package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExm6 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Double> half= (a,b)->(a+b)/2.0;
        System.out.println(half.apply(10,15));
    }
}
