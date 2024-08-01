package com.aamir.moin.BiFunction;


import java.util.function.BiFunction;

public class BiFunctionExm3 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sumOfSquare= (a,b)->a*a+b*b;
        System.out.println(sumOfSquare.apply(10,10));
    }
}
