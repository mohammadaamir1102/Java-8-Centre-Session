package com.aamir.bifunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class CombineMapsBiFunction {
	public static void main(String[] args) {
		BiFunction<Map<String, Integer>, Map<String, Integer>, Map<String, Integer>> biFunction = (map1, map2) -> {
			Map<String, Integer> result = new HashMap<>(map1);
			map2.forEach((key, value) -> result.merge(key, value, Integer::sum));
			return result;
		};
		Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
		Map<String, Integer> map2 = Map.of("B", 3, "C", 4);
		System.out.println(biFunction.apply(map1, map2));
	}
}
