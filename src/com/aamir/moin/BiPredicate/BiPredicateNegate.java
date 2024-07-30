package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateNegate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate=(n1,n2)->(n1+n2)%2==0;
        BiPredicate<Integer,Integer> negateBipredicate= biPredicate.negate();
        System.out.println(negateBipredicate.test(9,7));
    }
}
