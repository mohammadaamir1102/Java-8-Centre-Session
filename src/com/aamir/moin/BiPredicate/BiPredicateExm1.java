package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExm1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate=(a,b)->(a+b)>0;
        System.out.println(biPredicate.test(7,9));
    }
}
