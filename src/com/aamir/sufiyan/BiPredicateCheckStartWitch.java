package com.aamir.sufiyan;

import java.util.function.BiPredicate;

public class BiPredicateCheckStartWitch {
    public static void main(String[] args) {
        BiPredicate<String, String> startsWith = (a, b) -> a.startsWith(b);
        
        // Test cases
        System.out.println(startsWith.test("hello world", "hello")); // true
        System.out.println(startsWith.test("hello world", "world")); // false
        System.out.println(startsWith.test("Java programming", "Java")); // true
        System.out.println(startsWith.test("Java programming", "programming")); // false
    }
}