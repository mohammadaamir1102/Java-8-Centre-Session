package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;
class LessThanCheckProgramm{

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isLessThan = (a, b) -> a < b;
        
        System.out.println("Is 5 less than 10? " + isLessThan.test(5, 10));
        System.out.println("Is 10 less than 5? " + isLessThan.test(10, 5));
    }
}

