package com.aamir.sufiyan;

import java.util.List;
import java.util.function.Predicate;

public class PredicateCheckListIsEmpty {
	public static void main(String[] args) {
		Predicate<List<Integer>> isEmpty = list -> list.isEmpty();

		System.out.println(isEmpty.test(List.of())); // true
		System.out.println(isEmpty.test(List.of(1, 2, 3))); // false
	}
}
