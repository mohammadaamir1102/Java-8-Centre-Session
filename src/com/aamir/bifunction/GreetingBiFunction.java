package com.aamir.bifunction;

import java.util.function.BiFunction;

public class GreetingBiFunction {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (greeting, name) -> greeting + ", " + name + "!";
		System.out.println(biFunction.apply("Hello", "Alice"));
	}

}
