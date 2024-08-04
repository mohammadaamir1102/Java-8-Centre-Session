package com.aamir.faiz;

import java.util.function.Consumer;

public class ConsumerLambda {
	public static void main(String[] args) {
		Consumer<String> consumer = (str) -> System.out.println(str);
		consumer.accept("Hello");
	}
}
