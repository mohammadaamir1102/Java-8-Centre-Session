package com.aamir.faiz;

import java.util.List;
import java.util.function.BiPredicate;

public class DetermineTheListSizeIsEqualsOrNot {

	public static void main(String[] args) {
		List<Integer> firstList = firstList();
		List<Integer> secondList = secondList();

		BiPredicate<List<?>, List<?>> biPredicate = (list1, list2) -> firstList.size() == secondList.size();
		System.out.println(biPredicate.test(firstList, secondList));

	}

	public static List<Integer> firstList() {
		return List.of(1, 2, 4, 5);
	}

	public static List<Integer> secondList() {
		return List.of(1, 3, 5, 6);
	}

}
