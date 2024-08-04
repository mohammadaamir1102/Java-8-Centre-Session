package com.aamir.Consumer;

import java.util.function.Consumer;

public class ConsumerHandlingNullValue {
	public static void main(String[] args) {
		Consumer<String> nullSafeConsumer = value -> {
			if (value != null) {
				System.out.println(value);
			} else {
				System.out.println("value is null");
			}
		};
		nullSafeConsumer.accept("Hey Bro ");
	}
}