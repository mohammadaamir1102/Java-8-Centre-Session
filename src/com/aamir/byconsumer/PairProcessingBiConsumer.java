package com.aamir.byconsumer;

import java.util.AbstractMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class PairProcessingBiConsumer {
	public static void main(String[] args) {
		Map.Entry<String, Integer> entry = new AbstractMap.SimpleEntry<>("Key", 100);
		BiConsumer<String, Integer> biConsumer = (k, v) -> System.out.println(k + ": " + v);
		biConsumer.accept(entry.getKey(), entry.getValue());
	}
}
