package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExm2 {
    public static void main(String[] args) {
        BiPredicate<String,String> biPredicate=(s1,s2)->(s1==s2);
        System.out.println(biPredicate.test("abcd","cdsa"));
    }
}
