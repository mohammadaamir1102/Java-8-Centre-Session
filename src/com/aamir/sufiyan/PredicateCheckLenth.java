package com.aamir.sufiyan;

import java.util.function.Predicate;

public class PredicateCheckLenth {
    public static void main(String[] args) {
        Predicate<String> lengthGreaterThan = s -> s.length() > 5;
        System.out.println(lengthGreaterThan.test("Hello")); // false
        System.out.println(lengthGreaterThan.test("Hello, World!")); // true
    }
}
