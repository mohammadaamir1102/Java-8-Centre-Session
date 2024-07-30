package com.aamir.moin.Function;

import java.util.function.Function;

public class FunctionExm8 {
    public static void main(String[] args) {
        Function<String,String> function=s-> String.valueOf(s.charAt(3));
        System.out.println(function.apply("asdfghjkl"));
    }
}
