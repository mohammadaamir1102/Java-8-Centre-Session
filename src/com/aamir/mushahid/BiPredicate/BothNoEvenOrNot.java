package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class BothNoEvenOrNot {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bothEven = (a, b) -> a % 2 == 0 && b % 2 == 0;
        
     
        System.out.println("Are 4 and 6 both even? " + bothEven.test(4, 6));
        System.out.println("Are 4 and 7 both even? " + bothEven.test(4, 7));
    }
}
