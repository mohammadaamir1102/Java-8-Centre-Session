package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumerReverseString {
	public static void main(String[] args) {
		Consumer<String> Cc = str -> System.out.println(new StringBuilder(str).reverse().toString());
		Cc.accept("FAIZ");
	}
}
