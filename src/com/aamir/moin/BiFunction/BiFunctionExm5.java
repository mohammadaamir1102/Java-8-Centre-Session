package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExm5 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> sumOfHalf= (a,b)->(a+b)/2;
        sumOfHalf= sumOfHalf.andThen(a->a*5);
        System.out.println(sumOfHalf.apply(10,20));
    }
}
