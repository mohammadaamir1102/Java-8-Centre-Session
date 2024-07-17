package com.aamir.mushahid.Predicate;

import java.util.function.Predicate;

public class NumberIsPositiveOrNot {
    public static void main(String[] args) {
        Predicate<Integer> isPositiveOrNot = num -> num >= 0;

        System.out.println(isPositiveOrNot.test(-5)); 
        System.out.println(isPositiveOrNot.test(0)); 
        System.out.println(isPositiveOrNot.test(15));
    }
}
