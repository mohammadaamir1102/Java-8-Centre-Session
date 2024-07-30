package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateexm {
    public static void main(String[] args) {
        BiPredicate<String,Integer> biPredicate=(s,n)->s.length()==n;
        System.out.println(biPredicate.test("abdul",5));
    }

}
