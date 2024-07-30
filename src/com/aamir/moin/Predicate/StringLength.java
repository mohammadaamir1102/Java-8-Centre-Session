package com.aamir.moin.Predicate;

import java.util.function.Predicate;

public class StringLength {
    public static void main(String[] args) {
        Predicate<String> len= str->str.length()>5;
        System.out.println(len.test("abdulmoin"));
    }
}
