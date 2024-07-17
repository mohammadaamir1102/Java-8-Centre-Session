package com.aamir.mushahid.BiPredicate;

import java.util.function.BiPredicate;

public class StringLengthSameOrNot {
    public static void main(String[] args) {
        BiPredicate<String, String> sameLength = (str1, str2) -> str1.length() == str2.length();
        
        System.out.println(sameLength.test("apple", "banana"));
        System.out.println(sameLength.test("cat", "dog"));
    }
}
