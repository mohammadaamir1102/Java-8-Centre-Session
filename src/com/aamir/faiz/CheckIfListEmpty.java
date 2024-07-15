package com.aamir.faiz;

import java.util.List;
import java.util.function.Predicate;

public class CheckIfListEmpty {

	public static void main(String[] args) {
		List<Integer> list = list();
		Predicate<List<?>> predicate = list1 -> list1.isEmpty();
		System.out.println(predicate.test(list));

	}

	public static List<Integer> list() {
		return List.of(1, 2, 4, 5, 6, 7);
	}

}
