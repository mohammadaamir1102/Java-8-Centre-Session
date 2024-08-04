package com.aamir.byconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class AggregationBiConsumer {

	 public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<>();
	        map.put("A", 1);
	        map.put("B", 2);

	        BiConsumer<String, Integer> biConsumer = (k, v) -> map.put(k, map.getOrDefault(k, 0) + v);
	        biConsumer.accept("A", 5);
	        biConsumer.accept("C", 3);

	        map.forEach((k, v) -> System.out.println(k + ": " + v));
	    }
}
