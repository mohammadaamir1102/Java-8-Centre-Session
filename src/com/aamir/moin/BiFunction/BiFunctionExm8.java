package com.aamir.moin.BiFunction;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionExm8 {
    public static void main(String[] args) {
        BinaryOperator<String> function= (s1, s2)-> String.valueOf(s1.compareToIgnoreCase(s2));
        System.out.println(function.apply("asdfghjkl","adfhjjhfd"));
    }
}
