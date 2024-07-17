package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class DivisibilityCheckProgramm {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isDivisibleBy = (num, divisor) -> num % divisor == 0;
        
        System.out.println("Is 10 divisible by 2? " + isDivisibleBy.test(10, 2));
        System.out.println("Is 10 divisible by 3? " + isDivisibleBy.test(10, 3));
    }
}
