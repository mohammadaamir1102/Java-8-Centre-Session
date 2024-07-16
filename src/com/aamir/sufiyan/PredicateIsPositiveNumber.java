package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateIsPositiveNumber {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = n -> n > 0;
        System.out.println(isPositive.test(10)); // true
        System.out.println(isPositive.test(-5)); // false
    }
}
