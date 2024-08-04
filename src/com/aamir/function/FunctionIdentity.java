package com.aamir.function;

import java.util.function.Function;

public class FunctionIdentity {
	public static void main(String[] args) {
		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("Identity Function"));
	}

}
