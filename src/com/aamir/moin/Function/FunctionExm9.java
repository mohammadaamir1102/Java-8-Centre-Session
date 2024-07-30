package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm9 {
    public static void main(String[] args) {
        Function<String,String> function=s-> s.toLowerCase();
        System.out.println(function.apply("ABDUL"));
    }
}
