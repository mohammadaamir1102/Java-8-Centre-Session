package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class BothArePositiveCheckProgramm {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bothPositive = (a, b) -> a > 0 && b > 0;

        System.out.println(bothPositive.test(6, 4));
        System.out.println(bothPositive.test(-2, 4));
    }
}
