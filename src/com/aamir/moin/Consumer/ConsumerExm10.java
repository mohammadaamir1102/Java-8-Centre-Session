package com.aamir.moin.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExm10 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");


        Consumer<String> printUpperCaseConsumer = word -> System.out.println(word.toUpperCase());

        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(printUpperCaseConsumer);
    }
}
