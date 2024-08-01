package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExm4 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sumOfCube= (a,b)->(a*a*a+b*b*b);
        System.out.println(sumOfCube.apply(10,10));
    }
}
