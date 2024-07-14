package com.aamir.predicate;

import java.util.function.Predicate;

public class PredicateAndMethodWorks {

    public static void main(String[] args) {
        // And = This method combines two predicates into single one that return boolean value.
        Predicate<Integer> isEven = number -> number % 2 == 0; // false
        Predicate<Integer> isPositive = number -> number > 0; // true

        // false, true and -> true
        // below use and method
        Predicate<Integer> isEvenAndIsPositive = isEven.and(isPositive); // true
        System.out.println(isEvenAndIsPositive.test(3));

    }
}
