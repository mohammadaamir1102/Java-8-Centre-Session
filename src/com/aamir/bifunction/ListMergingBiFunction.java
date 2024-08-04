package com.aamir.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class ListMergingBiFunction {
	public static void main(String[] args) {
		BiFunction<List<String>, List<String>, List<String>> biFunction = (list1, list2) -> {
			List<String> result = new ArrayList<>(list1);
			result.addAll(list2);
			return result;
		};
		List<String> list1 = List.of("A", "B");
		List<String> list2 = List.of("C", "D");
		System.out.println(biFunction.apply(list1, list2));
	}
}
