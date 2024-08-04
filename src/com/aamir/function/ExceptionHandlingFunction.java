package com.aamir.function;

import java.util.function.Function;

public class ExceptionHandlingFunction {
	public static void main(String[] args) {
        Function<String, Integer> function = s -> {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return 0;
            }
        };
        System.out.println(function.apply("123a"));
    }
}
