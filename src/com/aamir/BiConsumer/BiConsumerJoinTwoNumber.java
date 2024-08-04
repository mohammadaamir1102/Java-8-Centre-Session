package com.aamir.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerJoinTwoNumber {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer = (no1, no2) -> System.out.println(no1 + "" + no2);

		biConsumer.accept(10, 20);
	}
}
