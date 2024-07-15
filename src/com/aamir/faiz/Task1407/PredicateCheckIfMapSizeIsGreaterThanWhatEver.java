package com.aamir.faiz.Task1407;

import java.util.Map;
import java.util.function.Predicate;

public class PredicateCheckIfMapSizeIsGreaterThanWhatEver {

	public static void main(String[] args) {
		Map<Integer, String> firstMap = firstMap();
		Predicate<Map<Integer, String>> predicate = value -> firstMap.size() < 5;
		System.out.println(predicate.test(firstMap));
	}

	public static Map<Integer, String> firstMap() {
		return Map.of(1, "faiz", 2, "sahil");
	}

}
