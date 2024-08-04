package com.aamir.PredicateAndBiPredicate;

import java.util.Map;
import java.util.function.Predicate;

public class PredicateNegateToCheckMapIsEmptyOrNot {

	public static void main(String[] args) {
		Map<Integer, String> firstMap = firstMap();

		Predicate<Map<?, ?>> predicate = map1 -> firstMap.isEmpty();
		Predicate<Map<?, ?>> negatePredicate = predicate.negate();

		System.out.println(negatePredicate.test(firstMap));
	}

	public static Map<Integer, String> firstMap() {
//		return Map.of(1,"faiz");
		return Map.of();
	}

}
