package com.aamir.moin.Predicate;

import java.util.function.Predicate;

public class EvenNumber {
    public static void main(String[] args) {
        Predicate<Integer> even=num->num%2==0;
        System.out.println(even.test(10));
    }
}
