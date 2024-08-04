package com.aamir.function;

import java.util.function.Function;

public class FilteringFunction {
	public static void main(String[] args) {
        Function<String, Boolean> function = s -> s.length() > 5;
        System.out.println(function.apply("Hello"));
        System.out.println(function.apply("Hello, World!"));
    }
}
