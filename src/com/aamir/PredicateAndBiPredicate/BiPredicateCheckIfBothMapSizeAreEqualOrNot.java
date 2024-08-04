package com.aamir.PredicateAndBiPredicate;

import java.util.Map;
import java.util.function.BiPredicate;

public class BiPredicateCheckIfBothMapSizeAreEqualOrNot {

	public static void main(String[] args) {
		Map<Integer, Integer> firstMap = firstMap();
		Map<Integer, String> secondMap = secondMap();

		BiPredicate<Map<?, ?>, Map<?, ?>> biPredicate = (map1, map2) -> firstMap.size() == secondMap.size();
		System.out.println(biPredicate.test(firstMap, secondMap));
	}

	public static Map<Integer, Integer> firstMap() {
		return Map.of(1, 2, 2, 2, 3, 4);
	}

	public static Map<Integer, String> secondMap() {
		return Map.of(1, "Faiz", 2, "Khan", 3, "sahil");
	}

}
