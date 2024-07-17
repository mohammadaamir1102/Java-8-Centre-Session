package com.aamir.Tufail;

import java.util.function.Predicate;

public class IsPositiveTest4 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println(isPositive.test(10));  // true
        
    }
}


