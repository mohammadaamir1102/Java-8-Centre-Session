package com.aamir.moin.BiPredicate;

import java.util.function.BiPredicate;

public class NumberAreEqual {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> numberAreEqual=(n1,n2)->n1==n2;
        System.out.println(numberAreEqual.test(5,5));
    }
}
