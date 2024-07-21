package com.aamir.faiz.Task1407;

import java.util.Map;
import java.util.function.Predicate;

public class PredicateCheckIfMapIsEmptyOrNot {

	public static void main(String[] args) {
		Map<Integer, String> firstMap = firstMap();
		Predicate<Map<?, ?>> predicate = map -> firstMap.isEmpty();
		System.out.println(predicate.test(firstMap));
	}

	public static Map<Integer, String> firstMap() {
		return Map.of(1,"faiz",2,"suhail",3,"sahil");
//		return Map.of();
	}

}
