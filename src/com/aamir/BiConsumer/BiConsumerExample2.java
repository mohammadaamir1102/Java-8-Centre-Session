package com.aamir.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {
	public static void main(String[] args) {
		BiConsumer<String, Double> convertAndPrint = (currency, amount) -> System.out
				.println("Amount in " + currency + ": " + (amount * 0.082));

		convertAndPrint.accept("USD", 100.0);

	}
}
