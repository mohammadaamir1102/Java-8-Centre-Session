package com.aamir.moin.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExm8 {
    public static void main(String[] args) {
        BiConsumer<String, String> printUpperCase = (s1, s2) ->
                System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());

        BiConsumer<String, String> printLowerCase = (s1, s2) ->
                System.out.println(s1.toLowerCase() + " " + s2.toLowerCase());

        BiConsumer<String, String> printBoth = printUpperCase.andThen(printLowerCase);
        printBoth.accept("abdul","MOIN");
    }
}
