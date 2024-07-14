package com.aamir.predicate;

import java.util.function.Predicate;

public class CheckStringLenghtGreatharThanWhatEver {
    public static void main(String[] args) {
        //
        Predicate<String> output = item -> item.length() < 5;
        System.out.println(output.test("Aamir khan"));
    }
}
