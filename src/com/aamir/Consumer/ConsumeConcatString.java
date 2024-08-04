package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumeConcatString {
	public static void main(String[] args) {
		Consumer<String> Cc = str -> System.out.println(str + "World");
		Cc.accept("Hello");

	}
}