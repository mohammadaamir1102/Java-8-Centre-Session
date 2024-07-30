package com.aamir.moin.Predicate;

import java.util.function.Predicate;

public class OddNumber {
    public static void main(String[] args) {
        Predicate<Integer> odd= num->num%2!=0;
        System.out.println(odd.test(5));
    }
}
