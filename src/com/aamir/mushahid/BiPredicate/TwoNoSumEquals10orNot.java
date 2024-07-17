package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class TwoNoSumEquals10orNot {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> SumEquals10 = (num1, num2) -> num1 + num2 == 10;
        
        System.out.println("Two No Sum Equals 10");
        System.out.println(SumEquals10.test(3, 7));
        System.out.println(SumEquals10.test(8, 5));
    }
}
